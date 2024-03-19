package com.savarino.services;

import java.util.List;

import com.savarino.entities.Viaggio;

public interface ViaggioService {
	
	List<Viaggio> getAll();
	Viaggio getViaggioById(int id);
	Viaggio addViaggio(Viaggio v);
	void deleteViaggio(Viaggio v);
	Viaggio updateViaggio(Viaggio v);
}
