package com.savarino.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_viaggio;
	
	private String origine;
	private String destinazione;
	private LocalDate data;
	private int postiDisponibili;
	
	@OneToMany(mappedBy = "viaggio", cascade = CascadeType.ALL)
	private Set<Prenotazione> prenotazione= new HashSet<Prenotazione>();

	public Viaggio(String origine, String destinazione, LocalDate data, int postiDisponibili) {
		this.origine = origine;
		this.destinazione = destinazione;
		this.data = data;
		this.postiDisponibili = postiDisponibili;
	}
	
	public Viaggio() {
	}

	
	
	public int getId_viaggio() {
		return id_viaggio;
	}

	public void setId_viaggio(int id_viaggio) {
		this.id_viaggio = id_viaggio;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getPostiDisponibili() {
		return postiDisponibili;
	}

	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}

	
	
}
