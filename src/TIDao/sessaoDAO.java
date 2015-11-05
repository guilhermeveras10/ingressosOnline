package TIDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import TIModel.TISessao;

/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 *
 */
public class sessaoDAO {

	public void inserir(TISessao sessao){
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("insert into sessao (horario,sala_idSala) values (?,?)");
			
			stmt.setTime(1, sessao.getHorario());
			stmt.setInt(2, sessao.getSala().getIdSala());
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
}
