package com.magazzino.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.magazzino.entities.Movimento;
import com.magazzino.entities.Prodotto;

@Service
public interface MagazzinoService {

	List<Prodotto> getProdotti();

	Prodotto addProdotto(Prodotto p);

	List<Movimento> getMovimenti();

	Movimento addMovimento(Movimento m);

}
