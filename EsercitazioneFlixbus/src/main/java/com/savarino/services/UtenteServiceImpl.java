package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Utente;
import com.savarino.repos.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	UtenteDAO dao;
	
	
	@Override
	public List<Utente> getAll() {
		return dao.findAll();
	}

	@Override
	public Utente getUtenteById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Utente addUtente(Utente u) {
		return dao.save(u);
	}

	@Override
	public void deleteUtente(Utente u) {
		dao.delete(u);
	}

	@Override
	public Utente updateUtente(Utente u) {
		return dao.save(u);
	}

}
