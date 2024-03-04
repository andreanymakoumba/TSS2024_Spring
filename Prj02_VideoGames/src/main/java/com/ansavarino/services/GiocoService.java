package com.ansavarino.services;

import java.util.List;

import com.ansavarino.entities.Gioco;

public interface GiocoService {

	List<Gioco> getGiochi();
	void addGioco(Gioco g);
}
