package com.serie.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "serie_tv")
public class Serie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String titolo;
	private String trama;
	private enum genere{}; //TODO
	private double valutazione;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTrama() {
		return trama;
	}
	public void setTrama(String trama) {
		this.trama = trama;
	}
	public double getValutazione() {
		return valutazione;
	}
	public void setValutazione(double valutazione) {
		this.valutazione = valutazione;
	}

	// le annotazioni @ prendono sempre l'elemento successivo
}
