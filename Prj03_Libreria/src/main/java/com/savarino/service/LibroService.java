package com.savarino.service;

import java.util.List;

import com.savarino.entities.Libro;

public interface LibroService {

	List<Libro> getLibri();
	Libro addLibro(Libro l);
	
}
