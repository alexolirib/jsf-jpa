package br.alex.pc.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@ManagedBean
public class ProfessorBean {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni7-pu");
	
	private Professor professor = new Professor();
	
	public String adicionar() {
		String proxima = "professores";
		
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(professor);
		em.getTransaction().commit();
		
		return proxima;
	}
	
	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public List<Professor> getProfessores(){
		List<Professor> result = new ArrayList<>();
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("select p from Professor p");
		result = query.getResultList();
		
		em.getTransaction().commit();
		
		return result;
	}
}
