package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entites.Ricetta;
import com.savarino.repos.RicetteDAO;

@Service
public class RicettaServiceImpl implements RicettaService {

	@Autowired
	private RicetteDAO dao;
	
	@Override
	public List<Ricetta> getRicette() {
		return dao.findAll();
	}

	@Override
	public List<Ricetta> getRicetteByIngredienti(String ingredienti) {
		return dao.findByIngredientiContains(ingredienti);
	}

	@Override
	public Ricetta getRicettaById(int id) {
		if(dao.findById(id).isPresent())
			return dao.findById(id).get();
		else
			return null;
	}

	@Override
	public Ricetta updateRicetta(Ricetta r) {
		return dao.save(r);
	}

	@Override
	public Ricetta addRicetta(Ricetta r) {
		return dao.save(r);
	}

	@Override
	public void deleteRicetta(Ricetta r) {
		dao.delete(r);
	}

}
