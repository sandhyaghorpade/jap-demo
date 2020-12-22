package com.cg.training.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.cg.training.entity.Greet;

public class GreetingTest {

	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		try {
			emf=Persistence.createEntityManagerFactory("jap-demo");
			em=emf.createEntityManager();
			em.getTransaction().begin();
			//Greet greet=new Greet();
			//greet.setGreeting(greeting);
			Greet greet=new Greet("Hi! Welcome to JPA");
			em.persist(greet);
			em.flush();
			em.getTransaction().commit();
			System.out.println("1 Greet object added");
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			emf.close();
			em.close();
			
		}

	}

}
