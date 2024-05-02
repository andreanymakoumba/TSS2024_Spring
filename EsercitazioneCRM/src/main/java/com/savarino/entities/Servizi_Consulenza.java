package com.savarino.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servizi_consulenza")
public class Servizi_Consulenza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Servizio;
	
	private String Nome_Servizio;
	private String Descrizione;
	private double Prezzo;
	
	public int getID_Servizio() {
		return ID_Servizio;
	}
	public void setID_Servizio(int iD_Servizio) {
		ID_Servizio = iD_Servizio;
	}
	
	public String getNome_Servizio() {
		return Nome_Servizio;
	}
	public void setNome_Servizio(String nome_Servizio) {
		Nome_Servizio = nome_Servizio;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	public double getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(double prezzo) {
		Prezzo = prezzo;
	}
	
	
}
