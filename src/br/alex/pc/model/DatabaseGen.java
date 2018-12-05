package br.alex.pc.model;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DatabaseGen {
	public static void main(String[] args) {
		Properties config = new Properties();
		config.put("hibernate.hbm2ddl.auto", "create");
		
		
		EntityManagerFactory factory = Persistence.
				createEntityManagerFactory("uni7-pu", config);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		Professor p1 = new Professor(null, "Roberio", "MSC");
		Professor p2 = new Professor(null, "Eduardo", "MSC");
		Professor p3 = new Professor(null, "Marum", "MSC");
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();

		em.close();
		factory.close();
	}
}
