package com.savarino.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Appuntamenti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Appuntamento;
	
	private int ID_Cliente;
}
