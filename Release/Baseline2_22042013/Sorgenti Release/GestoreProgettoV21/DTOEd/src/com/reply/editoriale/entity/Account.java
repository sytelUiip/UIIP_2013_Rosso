package com.reply.editoriale.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {
	
	private String nome = null;
	private String cognome = null;
	private String username = null;
	private String password = null;
	private String siglaRedazione = null;
	private String siglaGiornalista = null;
	private String stato = null;
//	private ArrayList<Gruppo> gruppi = new ArrayList<Gruppo>();
//	private Gruppo gruppoLavoro = null;
	private Gruppo[] gruppiLavoro = null;
//  private List<Gruppo> gruppiLavoro = new ArrayList<Gruppo>();	
//	private Gruppo[] gruppiLavoro = new Gruppo[2];
//	
//	public Account(){}
//	
//	public Account(String nome, String cognome, String username,
//			String password, String siglaRedazione, String siglaGiornalista,
//			String stato, Gruppo[] gruppiLavoro) {
//		super();
//		this.nome = nome;
//		this.cognome = cognome;
//		this.username = username;
//		this.password = password;
//		this.siglaRedazione = siglaRedazione;
//		this.siglaGiornalista = siglaGiornalista;
//		this.stato = stato;
//		this.gruppiLavoro = gruppiLavoro;
//		
//	}
//	
//	public Gruppo[] getGruppiLavoro() {
//		return gruppiLavoro;
//	}
//
//	public void setGruppiLavoro(Gruppo[] gruppiLavoro) {
//		this.gruppiLavoro = gruppiLavoro;
//	}
	
//	public Gruppo getGruppoLavoro() {
//		return gruppoLavoro;
//	}
//
//	public void setGruppoLavoro(Gruppo gruppoLavoro) {
//		this.gruppoLavoro = gruppoLavoro;
//	}

	public Account(){}
	
	public Account(String nome, String cognome, String username,
			String password, String siglaRedazione, String siglaGiornalista,
			String stato, Gruppo[] gruppiLavoro) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.siglaRedazione = siglaRedazione;
		this.siglaGiornalista = siglaGiornalista;
		this.stato = stato;
		//this.gruppi = gruppiLavoro;
		this.gruppiLavoro = gruppiLavoro;
		//this.gruppoLavoro = gruppoLavoro;
	}
	
	public Gruppo[] getGruppiLavoro() {
		return gruppiLavoro;
	}

	public void setGruppiLavoro(Gruppo[] gruppiLavoro) {
		this.gruppiLavoro = gruppiLavoro;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSiglaRedazione() {
		return siglaRedazione;
	}
	public void setSiglaRedazione(String siglaRedazione) {
		this.siglaRedazione = siglaRedazione;
	}
	public String getSiglaGiornalista() {
		return siglaGiornalista;
	}
	public void setSiglaGiornalista(String siglaGiornalista) {
		this.siglaGiornalista = siglaGiornalista;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}

//	public List<Gruppo> getGruppi() {
//		return gruppiLavoro;
//	}
//
//	public void setGruppi(List<Gruppo> gruppiLavoro) {
//		this.gruppiLavoro = gruppiLavoro;
//	}
//	
//	public Gruppo[] getGruppiLavoro(){
//		return gruppiLavoro.toArray(new Gruppo[gruppiLavoro.size()]);
//	}
//	
//	public void setGruppiLavoro(Gruppo[] gruppiArray) {
//		this.gruppiLavoro.clear();
//		for (int i = 0; i < gruppiArray.length; i++) 
//		{
//			this.gruppiLavoro.add(gruppiArray[i]);
//	}
}
	
	

