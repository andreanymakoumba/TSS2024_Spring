package com.savarino.services;

import java.util.List;

import com.savarino.entities.Prenotazione;

public interface PrenotazioneService {

	List<Prenotazione> getAll();
	Prenotazione getPrenotazioneById(int id);
	Prenotazione addPrenotazione(Prenotazione p);
	void deletePrenotazione(Prenotazione p);
	Prenotazione updatePrenotazione(Prenotazione p);
	
}
