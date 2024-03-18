package com.savarino.services;

import java.util.List;

import com.savarino.entities.Provincia;

public interface ProvinciaService {

	List<Provincia> getAll();
	Provincia getById(int id);
	
	List<Provincia> getProvinciaByRegione(String nomeRegione);
	List<String> getRegioni();
	
}
