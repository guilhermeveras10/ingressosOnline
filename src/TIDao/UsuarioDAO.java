package TIDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import TIModel.TIUsuario;


/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
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
	public TIUsuario login(){ 
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("select * usuario");

			ResultSet rs = stmt.executeQuery();
			
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
			return null;
		}
		
	}
}
