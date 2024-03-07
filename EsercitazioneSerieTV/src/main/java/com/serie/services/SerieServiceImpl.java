package com.serie.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serie.entities.Serie;
import com.serie.repos.SerieDAO;

@Service
public class SerieServiceImpl implements SerieService {
	
	@Autowired
	private SerieDAO dao;
	

	@Override
	public List<Serie> getSerie() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void addSerie(Serie s) {
		 dao.save(s);
	}

}