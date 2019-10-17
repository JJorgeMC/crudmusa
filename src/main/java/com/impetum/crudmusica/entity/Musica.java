package com.impetum.crudmusica.entity;

public class Musica {
	private int idmusica;
	private String titulo;
	private String autor;
	public Musica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Musica(int idmusica, String titulo, String autor) {
		super();
		this.idmusica = idmusica;
		this.titulo = titulo;
		this.autor = autor;
	}
	public int getIdmusica() {
		return idmusica;
	}
	public void setIdmusica(int idmusica) {
		this.idmusica = idmusica;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
