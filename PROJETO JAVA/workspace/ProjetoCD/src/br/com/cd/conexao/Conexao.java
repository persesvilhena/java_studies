package br.com.cd.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	//variavel q armazena a conexao
	private static Connection conexao = null;
	private String bancoDados = "projetocd";
	
	public Conexao() throws ClassNotFoundException, SQLException{
		//carregar o drive de conexao
			Class.forName("com.mysql.jdbc.Driver");
				//estabelece a conexao
				//servidor, porta, banco de dados, usuario, senha
				conexao = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/"+this.bancoDados+"","root","123456");
				conexao.setAutoCommit(false);
				System.out.println("Conexao realizada com sucesso");
	}
	//obtem a conexao
	public static Connection getInstance() throws ClassNotFoundException, SQLException{
		if (conexao == null){
			new Conexao();
		}
		return conexao;
	}

}
