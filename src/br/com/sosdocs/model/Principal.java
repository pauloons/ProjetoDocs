package br.com.sosdocs.model;

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

