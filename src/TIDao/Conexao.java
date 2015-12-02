package TIDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 * @author Bárbara Perina
 * babiperina@edu.unifor.br
 *
 */

public class Conexao {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/trabalhoIngressos", "root", "");
	}
}
