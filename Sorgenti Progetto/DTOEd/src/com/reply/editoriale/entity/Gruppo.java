package com.reply.editoriale.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Gruppo implements Serializable {
	
	private String nome = null;
	private Funzionalita[] funzioni = null;
	
//	public Gruppo(String nome, Funzionalita[] funzioni) {
//		super();
//		this.nome = nome;
//		//this.funzioni = funzioni;
//	}
	
//	public Gruppo(String nome) {
//		super();
//		this.nome = nome;
//	}
	
	public Gruppo() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funzionalita[] getFunzioni() {
		return funzioni;
	}
	
	public void setFunzioni(Funzionalita[] funzioni) {
		this.funzioni = funzioni;
	}
	
}
