package com.magazzino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magazzino.entities.Movimento;
import com.magazzino.entities.Prodotto;
import com.magazzino.repos.MovimentoDAO;
import com.magazzino.repos.ProdottoDAO;

@Service
public class MagazinoServiceImpl implements MagazzinoService{

	@Autowired
	ProdottoDAO pDao;
	
	@Autowired
	MovimentoDAO mDao;
	
	@Override
	public List<Prodotto> getProdotti() {
		
		return pDao.findAll();
	}

	@Override
	public Prodotto addProdotto(Prodotto p) {
		return pDao.save(p);
	}

	@Override
	public List<Movimento> getMovimenti() {
		return mDao.findAll();
	}

	@Override
	public Movimento addMovimento(Movimento m) {
		return mDao.save(m);
	}

}
