package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Provincia;
import com.savarino.repos.ProvinciaDAO;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{

	//COLLEGAMENTO AL DAO
	@Autowired
	private ProvinciaDAO dao;
	
	@Override
	public List<Provincia> getAll() {
		return dao.findAll();
	}

	@Override
	public Provincia getById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Provincia> getProvinciaByRegione(String nomeRegione) {
		return dao.findByRegione(nomeRegione);
	}

	@Override
	public List<String> getRegioni() {
		return dao
				.findAll()
				.stream()
				.map(p -> p.getRegione())
				.distinct()
				.sorted()
				.toList();
	}

}
