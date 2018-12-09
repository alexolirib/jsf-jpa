package br.alex.pc.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
@SessionScoped
public class ArticleBean {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni7-pu");
	
	private Article article = new Article();
	
	
	private Author author = new Author();
	
	public void adicionarAutorNaLista() {
		if(!author.getName().equals("") && !author.getEmail().equals("")) {
			
			article.getAuthors().add(new Author(null, author.getName(), author.getEmail()));

			author.setName("");
			author.setEmail("");
			
		}
	}
	
	public String commitAutorArtigo() {
		if(article.getTitle().equals("")) {
			
			return "articles";
		}
		for(Author author: article.getAuthors()) {
			author.setArticle(article);
		}
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(article);
		
		
		em.getTransaction().commit();
		
		return "article";
	}
	
	public String voltarParaArticles() {
		article = new Article();
		return "articles";
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	

}
