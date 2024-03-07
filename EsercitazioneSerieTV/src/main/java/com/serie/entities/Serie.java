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
	@GeneratedValue(strategy = GenerationType.IDENTITY) // della chiave primaria se ne occupa il DB della chiave
														// primaria
//	@Column(name ="title") //annotazione non necessaria
	private int id;
	private String titolo;
	private String trama;
	private enum genere{}; //TODO
	private int valutazione;
	
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
	public int getValutazione() {
		return valutazione;
	}
	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}

	// le annotazioni @ prendono sempre l'elemento successivo
}
