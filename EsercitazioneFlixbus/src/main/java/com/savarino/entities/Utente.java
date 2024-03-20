package com.savarino.entities;

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
@Table(name = "utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_utente;
	
	private String nome;
	private String cognome;
	private String email;

	@OneToMany(mappedBy = "utente", cascade = CascadeType.ALL)
	private Set<Prenotazione> prenotazioni=new HashSet<Prenotazione>();
	
	public Utente() {
	}
	
	public Utente(String nome, String cognome, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	
	

	public int getId_utente() {
		return id_utente;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Utente [id_utente=" + id_utente + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", prenotazioni=" + prenotazioni + "]";
	}
	
	
}
