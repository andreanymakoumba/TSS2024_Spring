package com.savarino.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appuntamenti")
public class Appuntamenti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Appuntamento;

	// fk
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente ID_Cliente;

	private LocalDate Data_Appuntamento;
	private String Descrizione;

	// utente associato

	@ManyToOne
	@JoinColumn(name = "utente_associato")
	private Utente Utente_Associato;

	public int getID_Appuntamento() {
		return ID_Appuntamento;
	}

	public void setID_Appuntamento(int iD_Appuntamento) {
		ID_Appuntamento = iD_Appuntamento;
	}

	public LocalDate getData_Appuntamento() {
		return Data_Appuntamento;
	}

	public void setData_Appuntamento(LocalDate data_Appuntamento) {
		Data_Appuntamento = data_Appuntamento;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public Cliente getID_Cliente() {
		return ID_Cliente;
	}

	public void setID_Cliente(Cliente iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}

	public Utente getUtente_Associato() {
		return Utente_Associato;
	}

	public void setUtente_Associato(Utente utente_Associato) {
		Utente_Associato = utente_Associato;
	}

	
	
}
