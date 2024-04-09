package com.savarino.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.biblioteca.entities.Autore;
import com.savarino.biblioteca.entities.Editore;
import com.savarino.biblioteca.entities.Libro;

@Service
public class BibliotecaServiceImpl implements BibliotecaService {

	@Autowired
	
	
	
	
	@Override
	public List<Libro> getLibri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autore> getAutori() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Editore> getEditori() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autore addAutore(Autore a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editore addEditore(Editore e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro addLibro(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autore updAutore(Autore a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editore updEditore(Editore e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro updLibro(Libro l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAutore(Autore a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEditore(Editore e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLibro(Libro l) {
		// TODO Auto-generated method stub

	}

}
