package com.savarino.services;

import java.util.List;

import com.savarino.entities.Prodotto;

public interface ProdottiService {

	List<Prodotto> getProdotti();
	Prodotto getProdotto();
}
