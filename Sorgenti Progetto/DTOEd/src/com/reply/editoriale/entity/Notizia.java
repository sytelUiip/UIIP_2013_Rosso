package com.reply.editoriale.entity;

import java.util.GregorianCalendar;

public class Notizia {
	
	private int id;
	private String autore;
	private String ultimoDigitatore;
	private String stato;
	private String lock;
	private String titolo;
	private String sottoTitolo;
	private String dataCreazione;
	private String dataTrasmissione;
	private String testo;
	private int lunghezzaTesto;
	private String ultimoLock;
	
	public Notizia(){}
	
	public Notizia(int id, String autore, String ultimoDigitatore,
			String stato, String lock, String titolo, String sottoTitolo,
			String dataCreazione, String dataTrasmissione, String testo, int lunghezzaTesto) {
		super();
		this.id = id;
		this.autore = autore;
		this.ultimoDigitatore = ultimoDigitatore;
		this.stato = "S";
		this.lock = "N";
		this.titolo = titolo;
		this.sottoTitolo = sottoTitolo;
		this.dataCreazione = dataCreazione;
		this.dataTrasmissione = dataTrasmissione;
		this.testo = testo;
		this.lunghezzaTesto = lunghezzaTesto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getUltimoDigitatore() {
		return ultimoDigitatore;
	}

	public void setUltimoDigitatore(String ultimoDigitatore) {
		this.ultimoDigitatore = ultimoDigitatore;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getLock() {
		return lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getSottoTitolo() {
		return sottoTitolo;
	}

	public void setSottoTitolo(String sottoTitolo) {
		this.sottoTitolo = sottoTitolo;
	}

	public String getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public String getDataTrasmissione() {
		return dataTrasmissione;
	}

	public void setDataTrasmissione(String dataTrasmissione) {
		this.dataTrasmissione = dataTrasmissione;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public int getLunghezzaTesto() {
		return lunghezzaTesto;
	}

	public void setLunghezzaTesto(int lunghezzaTesto) {
		this.lunghezzaTesto = lunghezzaTesto;
	}

	public String getUltimoLock() {
		return ultimoLock;
	}

	public void setUltimoLock(String ultimoLock) {
		this.ultimoLock = ultimoLock;
	}
	
}
