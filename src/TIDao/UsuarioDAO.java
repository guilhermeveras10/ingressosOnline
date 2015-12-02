package TIDao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.jdbc.UpdatableResultSet;

import TIModel.TIUsuario;


/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 * @author Bárbara Perina Bezerra
 * babiperina@edu.unifor.br
 *
 */

public class UsuarioDAO {

	public void cadastrar(TIUsuario usuario) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("insert into usuario (cpf,email,nome,senha) values (?,?,?,?)");
			
			stmt.setInt(1, usuario.getCPF());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getNome());
			stmt.setString(4, usuario.getSenha());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public TIUsuario login(String usuario, String senha){ 
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("select * from usuario where email=? and senha=?");
			stmt.setString(1, usuario);
			stmt.setString(2, senha);
			
			System.out.println(usuario + " - " + senha);

			ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					System.out.println("teste");
					int cpf = rs.getInt(1);
					String nome = rs.getString(3);
					String email = rs.getString(2);
					String senha2 = rs.getString(4);
					
					return new TIUsuario(cpf, nome, email, senha2);
				}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
					stmt.close();
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
	}
}
