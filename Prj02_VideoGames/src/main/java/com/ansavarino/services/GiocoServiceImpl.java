package com.ansavarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ansavarino.entities.Gioco;
import com.ansavarino.repos.GiocoDAO;

@Service
public class GiocoServiceImpl implements GiocoService {

	@Autowired
	private GiocoDAO dao;
	
	@Override
	public List<Gioco> getGiochi() {
		return dao.findAll();
	}

	@Override
	public void addGioco(Gioco g) {
		dao.save(g);
	}

}
