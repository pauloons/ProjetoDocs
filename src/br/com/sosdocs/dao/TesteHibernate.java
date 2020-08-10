/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sosdocs.dao;

import javax.persistence.EntityManager;

/**
 *
 * @author tiago
 */
public class TesteHibernate {
    public static void main(String[] args) {
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        //Codigo de Persistencia Aqui
            
        em.getTransaction().commit();
        em.close();
        
    }
}
