package br.alex.pc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String titulação;
	
	
	
	public Professor() {
		super();
	}
	public Professor(Integer id, String nome, String titulação) {
		super();
		this.id = id;
		this.nome = nome;
		this.titulação = titulação;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulação() {
		return titulação;
	}
	public void setTitulação(String titulação) {
		this.titulação = titulação;
	}
	
	
}
