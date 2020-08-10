package br.com.sosdocs.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	conexao(){
		
		url = "jdbc:postgresql://localhost:5432/patrimonioDoc123";
		usuario ="postgres";
		senha = "postgres";
		
		try {
			Class.forName("org.postgresql.Driver");
			 con = DriverManager.getConnection(url, usuario, senha);
			 System.out.println("Conex�o efetuada com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
