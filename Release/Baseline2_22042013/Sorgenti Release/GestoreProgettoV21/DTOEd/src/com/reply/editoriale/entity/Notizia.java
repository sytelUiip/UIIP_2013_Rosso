package com.reply.editoriale.entity;

import java.util.GregorianCalendar;

public class Notizia {
	
	private int id;
	private Account autore;
	private Account ultimoDigitatore;
	private String stato;
	private String lock;
	private String titolo;
	private String sottoTitolo;
	private GregorianCalendar dataCreazione;
	private GregorianCalendar dataTrasmissione;
	private String testo;
	private int lunghezzaTesto;
	
	public Notizia(){}
	
	public Notizia(int id, Account autore, Account ultimoDigitatore,
			String stato, String lock, String titolo, String sottoTitolo,
			GregorianCalendar dataCreazione,
			GregorianCalendar dataTrasmissione, String testo, int lunghezzaTesto) {
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

	public Account getAutore() {
		return autore;
	}

	public void setAutore(Account autore) {
		this.autore = autore;
	}

	public Account getUltimoDigitatore() {
		return ultimoDigitatore;
	}

	public void setUltimoDigitatore(Account ultimoDigitatore) {
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

	public GregorianCalendar getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(GregorianCalendar dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public GregorianCalendar getDataTrasmissione() {
		return dataTrasmissione;
	}

	public void setDataTrasmissione(GregorianCalendar dataTrasmissione) {
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
	
}
