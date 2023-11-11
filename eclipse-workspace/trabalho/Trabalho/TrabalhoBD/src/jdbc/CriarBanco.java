package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void criandoBanco() throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
				
		conexao.close();
	}

}
