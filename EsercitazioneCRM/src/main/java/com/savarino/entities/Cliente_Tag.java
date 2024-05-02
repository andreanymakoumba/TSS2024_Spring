package com.savarino.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cliente_Tag")
public class Cliente_Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Cliente_Tag;
	
	private int ID_Cliente;
	private int ID_Tag;
	
	
	public int getID_Cliente_Tag() {
		return ID_Cliente_Tag;
	}
	public void setID_Cliente_Tag(int iD_Cliente_Tag) {
		ID_Cliente_Tag = iD_Cliente_Tag;
	}
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public int getID_Tag() {
		return ID_Tag;
	}
	public void setID_Tag(int iD_Tag) {
		ID_Tag = iD_Tag;
	}
	
	
}
