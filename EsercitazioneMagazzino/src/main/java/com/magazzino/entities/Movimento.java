package com.magazzino.entities;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimenti")
public class Movimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int id_prodotto;
	private int entrate;
	private int uscite;
	private LocalDate data;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_prodotto() {
		return id_prodotto;
	}
	public void setId_prodotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}
	public int getEntrate() {
		return entrate;
	}
	public void setEntrate(int entrate) {
		this.entrate = entrate;
	}
	public int getUscite() {
		return uscite;
	}
	public void setUscite(int uscite) {
		this.uscite = uscite;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Movimento [id=" + id + ", id_prodotto=" + id_prodotto + ", entrate=" + entrate + ", uscite=" + uscite
				+ ", data=" + data + "]";
	}
	
	

}