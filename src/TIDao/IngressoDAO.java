package TIDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import TIModel.TIIngresso;

/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 *
 */
public class IngressoDAO {
	public void inserir(TIIngresso ingresso){

		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("insert into ingresso (usuario_idUsuario,sessao_idSessao,data) values (?,?,?)");
			stmt.setInt(1, ingresso.getUsuario().getIdUsuario());
			stmt.setInt(2, ingresso.getSessao().getIdSessao());
			stmt.setString(3, ingresso.getData());
			
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
