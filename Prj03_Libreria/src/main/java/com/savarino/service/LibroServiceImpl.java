package com.savarino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Libro;
import com.savarino.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO dao;
	
	@Override
	public List<Libro> getLibri() {
		return dao.findAll();
	}

	@Override
	public Libro addLibro(Libro l) {
		return dao.save(l);
	}

}
