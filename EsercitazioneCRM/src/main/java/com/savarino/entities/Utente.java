package com.savarino.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Utente;
	
	private String Nome_Utente;
	private String Ruolo;
	private String Email;
	private String Password;
	private LocalDate Data_Registrazione;
	
	
	
	
	public int getID_Utente() {
		return ID_Utente;
	}
	public void setID_Utente(int iD_Utente) {
		ID_Utente = iD_Utente;
	}
	public String getNome_Utente() {
		return Nome_Utente;
	}
	public void setNome_Utente(String nome_Utente) {
		Nome_Utente = nome_Utente;
	}
	public String getRuolo() {
		return Ruolo;
	}
	public void setRuolo(String ruolo) {
		Ruolo = ruolo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LocalDate getData_Registrazione() {
		return Data_Registrazione;
	}
	public void setData_Registrazione(LocalDate data_Registrazione) {
		Data_Registrazione = data_Registrazione;
	}
	
	
}
