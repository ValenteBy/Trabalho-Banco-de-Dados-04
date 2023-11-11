package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaFilhos {

	public static void criartabelafilho() throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS filhos (" 
				+"cod INT NOT NULL AUTO_INCREMENT PRIMARY KEY,"
				+"nome VARCHAR(80) NOT NULL,"
				+"mae_cod int NOT NULL,"
				+"FOREIGN KEY (mae_cod) REFERENCES mae (codigo)"
				+")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		conexao.close();
	}

}
