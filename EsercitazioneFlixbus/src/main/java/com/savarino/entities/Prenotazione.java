package com.savarino.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prenotazione;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_utente")
	private Utente utente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_viaggio")
	private Viaggio viaggio;
	
	private String stato;
	
	public Prenotazione(Utente utente, Viaggio viaggio, String stato) {
		this.utente = utente;
		this.viaggio = viaggio;
		this.stato = stato;
	}

	public Prenotazione() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_prenotazione() {
		return id_prenotazione;
	}



	public void setId_prenotazione(int id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}



	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Viaggio getViaggio() {
		return viaggio;
	}

	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "Prenotazione [id_prenotazione=" + id_prenotazione + ", utente=" + utente + ", viaggio=" + viaggio
				+ ", stato=" + stato + "]";
	}
	
	
	
}
