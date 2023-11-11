package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class principalTeste {

	public static void main(String[] args) throws SQLException, NoSuchElementException {
		
		//CriarBanco.criandoBanco();
		AdicionarMaeClasse.adicionarMae();
		AdicionarFilhoClasse.adicionarSomenteUmFilho();
		//AdicionarFilhoClasse.removerFilho();
		//AdicionarMaeClasse.corrigirNome();
		//AdicionarMaeClasse.pesquisarFilhos();
		//AdicionarFilhoClasse.arrayFilho();
	}
	
}
