package com.savarino.services;

import java.util.List;

import com.savarino.entities.Utente;


public interface UtenteService {

	List<Utente> getAll();
	Utente getUtenteById(int id);
	Utente addUtente(Utente u);
	void deleteUtente(Utente u);
	Utente updateUtente(Utente u);
	
}