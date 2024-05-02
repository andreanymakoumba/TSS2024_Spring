package com.savarino.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class Tag_Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Tag;
	
	private String Nome_Tag;
	
	@ManyToMany(mappedBy = "tags")
    private Set<Cliente> clienti = new HashSet<>();

	public int getID_Tag() {
		return ID_Tag;
	}

	public void setID_Tag(int iD_Tag) {
		ID_Tag = iD_Tag;
	}

	public String getNome_Tag() {
		return Nome_Tag;
	}

	public void setNome_Tag(String nome_Tag) {
		Nome_Tag = nome_Tag;
	}

	public Set<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(Set<Cliente> clienti) {
		this.clienti = clienti;
	}

	
}
