package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Prenotazione;
import com.savarino.repos.PrenotazioneDAO;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

	@Autowired
	PrenotazioneDAO dao;
	
	@Override
	public List<Prenotazione> getAll() {
		return dao.findAll();
	}

	@Override
	public Prenotazione getPrenotazioneById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return dao.save(p);
	}

	@Override
	public void deletePrenotazione(Prenotazione p) {
		dao.delete(p);
	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione p) {
		return dao.save(p);
	}

}
