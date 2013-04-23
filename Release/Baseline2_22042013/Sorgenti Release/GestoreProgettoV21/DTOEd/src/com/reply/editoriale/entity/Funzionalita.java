package com.reply.editoriale.entity;

import java.io.Serializable;

public class Funzionalita implements Serializable {
	
	private String nome = null;
	private String sigla = null;
	
	public Funzionalita(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public Funzionalita() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	

}
