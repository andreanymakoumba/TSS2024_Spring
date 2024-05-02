package com.savarino.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Note_Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Nota;
	
	//fk mto
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente ID_Cliente;
	
	@ManyToOne
	@JoinColumn(name = "utente_registrante")
	private Utente Utente_Registrante;

	private String Testo_Nota;
	private LocalDate Data_Registrazione;
	
	public int getID_Nota() {
		return ID_Nota;
	}
	public void setID_Nota(int iD_Nota) {
		ID_Nota = iD_Nota;
	}
	public Cliente getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(Cliente iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public Utente getUtente_Registrante() {
		return Utente_Registrante;
	}
	public void setUtente_Registrante(Utente utente_Registrante) {
		Utente_Registrante = utente_Registrante;
	}
	public String getTesto_Nota() {
		return Testo_Nota;
	}
	public void setTesto_Nota(String testo_Nota) {
		Testo_Nota = testo_Nota;
	}
	public LocalDate getData_Registrazione() {
		return Data_Registrazione;
	}
	public void setData_Registrazione(LocalDate data_Registrazione) {
		Data_Registrazione = data_Registrazione;
	}
	
	
}
