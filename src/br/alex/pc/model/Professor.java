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
	private String titula��o;
	
	
	
	public Professor() {
		super();
	}
	public Professor(Integer id, String nome, String titula��o) {
		super();
		this.id = id;
		this.nome = nome;
		this.titula��o = titula��o;
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
	public String getTitula��o() {
		return titula��o;
	}
	public void setTitula��o(String titula��o) {
		this.titula��o = titula��o;
	}
	
	
}
