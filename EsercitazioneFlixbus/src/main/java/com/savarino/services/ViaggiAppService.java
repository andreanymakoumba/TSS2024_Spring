package com.savarino.services;

import java.util.List;

import com.savarino.entities.Prenotazione;
import com.savarino.entities.Utente;
import com.savarino.entities.Viaggio;

public interface ViaggiAppService {

	//Prenotazione
	List<Prenotazione> getAllPrenotazioni();
	Prenotazione getPrenotazioneById(int id);
	Prenotazione addPrenotazione(Prenotazione p);
	void deletePrenotazione(Prenotazione p);
	Prenotazione updatePrenotazione(Prenotazione p);
	
	//Utente
	List<Utente> getAllUtenti();
	Utente getUtenteById(int id);
	Utente addUtente(Utente u);
	void deleteUtente(Utente u);
	Utente updateUtente(Utente u);
	
	//Viaggio
	List<Viaggio> getAllViaggi();
	Viaggio getViaggioById(int id);
	Viaggio addViaggio(Viaggio v);
	void deleteViaggio(Viaggio v);
	Viaggio updateViaggio(Viaggio v);
}
