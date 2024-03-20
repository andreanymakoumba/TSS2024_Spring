package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Prenotazione;
import com.savarino.entities.Utente;
import com.savarino.entities.Viaggio;
import com.savarino.repos.PrenotazioneDAO;
import com.savarino.repos.UtenteDAO;
import com.savarino.repos.ViaggioDAO;

@Service
public class ViaggiAppServiceImpl implements ViaggiAppService {

	@Autowired
	PrenotazioneDAO daoPrenotazione;
	
	@Autowired
	UtenteDAO daoUtente;
	
	@Autowired
	ViaggioDAO daoViaggio;

	@Override
	public Prenotazione getPrenotazioneById(int id) {
		return daoPrenotazione.findById(id).get();
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return daoPrenotazione.save(p);
	}

	@Override
	public void deletePrenotazione(Prenotazione p) {
		daoPrenotazione.delete(p);
	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione p) {
		return daoPrenotazione.save(p);
	}

	@Override
	public List<Prenotazione> getAllPrenotazioni() {
		return daoPrenotazione.findAll();
	}

	@Override
	public List<Utente> getAllUtenti() {
		return daoUtente.findAll();
	}

	@Override
	public Utente getUtenteById(int id) {
		return daoUtente.findById(id).get();
	}

	@Override
	public Utente addUtente(Utente u) {
		return daoUtente.save(u);
	}

	@Override
	public void deleteUtente(Utente u) {
		daoUtente.delete(u);
	}

	@Override
	public Utente updateUtente(Utente u) {
		return daoUtente.save(u);
	}

	@Override
	public List<Viaggio> getAllViaggi() {
		return daoViaggio.findAll();
	}

	@Override
	public Viaggio getViaggioById(int id) {
		return daoViaggio.findById(id).get();
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		return daoViaggio.save(v);
	}

	@Override
	public void deleteViaggio(Viaggio v) {
		daoViaggio.delete(v);
	}

	@Override
	public Viaggio updateViaggio(Viaggio v) {
		return daoViaggio.save(v);
	}

}
