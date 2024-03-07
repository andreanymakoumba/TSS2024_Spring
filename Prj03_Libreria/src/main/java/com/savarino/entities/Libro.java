package com.savarino.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libro {
	private String titolo;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//è il db che gest
	private int id;
	private int pagine;
	@Column(name = "id_editore")
	private int idEditore;
	private double prezzo;
	
	
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public int getIdEditore() {
		return idEditore;
	}
	public void setIdEditore(int idEditore) {
		this.idEditore = idEditore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}




}
