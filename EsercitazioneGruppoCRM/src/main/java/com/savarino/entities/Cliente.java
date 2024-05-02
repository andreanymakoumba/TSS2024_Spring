package com.savarino.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

public class Cliente {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long ID_Cliente;
	  
	  private String Nome_Azienda;
	  private String Referente_Aziendale;
	  private String Categoria_Merceologica;
	  private String Tipologia_Cliente;
	  private int Utente_Associato;
	  
	  @ManyToMany
	    @JoinTable(
	        name = "Cliente_Tag",
	        joinColumns = @JoinColumn(name = "ID_Cliente"),
	        inverseJoinColumns = @JoinColumn(name = "ID_Tag")
	    )
	    private Set<Tag_Cliente> tags = new HashSet<>();

	public Long getID_Cliente() {
		return ID_Cliente;
	}

	public void setID_Cliente(Long iD_Cliente) {
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

	public int getUtente_Associato() {
		return Utente_Associato;
	}

	public void setUtente_Associato(int utente_Associato) {
		Utente_Associato = utente_Associato;
	}

	public Set<Tag_Cliente> getTags() {
		return tags;
	}

	public void setTags(Set<Tag_Cliente> tags) {
		this.tags = tags;
	}

	    
}
