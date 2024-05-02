package com.savarino.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Cliente;

	private String Nome_Azienda;
	private String Referente_Aziendale;
	private String Categoria_Merceologica;
	private String Tipologia_Cliente;
	
	@ManyToOne
	@JoinColumn(name = "utente_associato")
    private Utente Utente_Associato;

	@ManyToMany
	@JoinTable(name = "Cliente_Tag", joinColumns = @JoinColumn(name = "ID_Cliente"), inverseJoinColumns = @JoinColumn(name = "ID_Tag"))
	private List<Tag_Cliente> tags;

	public int getID_Cliente() {
		return ID_Cliente;
	}

	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}

	public String getNome_Azienda() {
		return Nome_Azienda;
	}

	public void setNome_Azienda(String nome_Azienda) {
		Nome_Azienda = nome_Azienda;
	}

	public String getReferente_Aziendale() {
		return Referente_Aziendale;
	}

	public void setReferente_Aziendale(String referente_Aziendale) {
		Referente_Aziendale = referente_Aziendale;
	}

	public String getCategoria_Merceologica() {
		return Categoria_Merceologica;
	}

	public void setCategoria_Merceologica(String categoria_Merceologica) {
		Categoria_Merceologica = categoria_Merceologica;
	}

	public String getTipologia_Cliente() {
		return Tipologia_Cliente;
	}

	public void setTipologia_Cliente(String tipologia_Cliente) {
		Tipologia_Cliente = tipologia_Cliente;
	}

	public Utente getUtente_Associato() {
		return Utente_Associato;
	}

	public void setUtente_Associato(Utente utente_Associato) {
		Utente_Associato = utente_Associato;
	}

	public List<Tag_Cliente> getTags() {
		return tags;
	}

	public void setTags(List<Tag_Cliente> tags) {
		this.tags = tags;
	}

}
