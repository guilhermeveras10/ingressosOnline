package TIDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import TIModel.TIIngresso;
import TIModel.TISala;

/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 *
 */
public class SalaDAO {

	public void inserir(TISala sala){

		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = Conexao.getConexao();
			stmt = con.prepareStatement("insert into sala (idSala,numero,qtdeLugares,valor,quatroD,filme_idFilme) values (?,?,?,?,?,?)");
			stmt.setInt(1, sala.getIdSala());
			stmt.setInt(2, sala.getNumero());
			stmt.setInt(3, sala.getQtdeLugares());
			stmt.setInt(4, sala.getValor());
			stmt.setBoolean(5, sala.isQuatroD());
			stmt.setInt(6, sala.getFilme().getIdFilme());
			
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
