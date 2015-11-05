package TIDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import TIModel.TIFilme;
import TIModel.TIUsuario;

/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 *
 */
public class FilmeDAO {

	public void inserir(TIFilme filme){

		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("insert into filme (titulo,classificacao,diretor) values (?,?,?)");
			
			stmt.setString(1, filme.getTitulo());
			stmt.setString(2, filme.getClassificacao());
			stmt.setString(3, filme.getDiretor());
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
	public void excluir(int idFilme) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("delete from filme where idFilme=?");
			
			stmt.setInt(1, idFilme);
			
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
	public List<TIFilme> listar() {
		Connection con = null;
		PreparedStatement stmt = null;
		ArrayList<TIFilme> deps = new ArrayList<TIFilme>();
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("select * from filme");
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int c = rs.getInt("idFilme");
				String t = rs.getString("titulo");
				String cl = rs.getString("classificacao");
				String d = rs.getString("diretor"); 
				
				TIFilme f = new TIFilme();
				f.setIdFilme(c);
				f.setTitulo(t);
				f.setClassificacao(cl);
				f.setDiretor(d);
				
				deps.add(f);
			}
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
		
		return deps;
	}
	
}
