package main.java;

import javax.persistence.EntityManager;

import br.com.sosdocs.dao.JPAUtil;

public class Principal {

		public static void main(String[] args) {
			EntityManager em = new JPAUtil().getEntityManager();
	        em.getTransaction().begin();
	        
	        //Codigo de Persistencia Aqui
	            
	        em.getTransaction().commit();
	        em.close();
		}
	
}

	/*
	url = "jdbc:postgresql://localhost:5432/PatrimonioDoc";
	usuario ="postgres";
	senha = "postgres";
	Connection con;

	
	try {
		Class.forName("org.postgresql.Driver");
		 con = DriverManager.getConnection(url, usuario, senha);
		 System.out.println("Conexe��o efetuada com sucesso");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}*/