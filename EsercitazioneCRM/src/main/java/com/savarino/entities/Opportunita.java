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
@Table(name = "Opportunita")
public class Opportunita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Opportunita;
	
	//fk id cliente
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente ID_Cliente;
	
	private String Descrizione_Opportunita;
	private LocalDate Data_Inserimento;
	private String Stato;
	
	public int getID_Opportunita() {
		return ID_Opportunita;
	}
	public void setID_Opportunita(int iD_Opportunita) {
		ID_Opportunita = iD_Opportunita;
	}
	public Cliente getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(Cliente iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public String getDescrizione_Opportunita() {
		return Descrizione_Opportunita;
	}
	public void setDescrizione_Opportunita(String descrizione_Opportunita) {
		Descrizione_Opportunita = descrizione_Opportunita;
	}
	public LocalDate getData_Inserimento() {
		return Data_Inserimento;
	}
	public void setData_Inserimento(LocalDate data_Inserimento) {
		Data_Inserimento = data_Inserimento;
	}
	public String getStato() {
		return Stato;
	}
	public void setStato(String stato) {
		Stato = stato;
	}
	
	
}
