package br.com.info.conexao;

import java.sql.SQLException;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Conexao a = new Conexao();
		a.getInstance();
		System.out.println(a.getInstance()); 

	}

}
