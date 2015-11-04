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
			stmt = con.prepareStatement("insert into sessao (idSessao,horario,sala_idSala) values (?,?,?)");
			stmt.setInt(1, sessao.getIdSessao());
			stmt.setTime(2, sessao.getHorario());
			stmt.setInt(3, sessao.getSala().getIdSala());
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
