package com.savarino.biblioteca.service;

import java.util.List;

import com.savarino.biblioteca.entities.Autore;
import com.savarino.biblioteca.entities.Editore;
import com.savarino.biblioteca.entities.Libro;

public interface BibliotecaService {
	
	List<Libro> getLibri();
	List<Autore> getAutori();
	List<Editore> getEditori();
	
	Autore addAutore(Autore a);
	Editore addEditore(Editore e);
	Libro addLibro(Libro l);
	
	Autore updAutore(Autore a);
	Editore updEditore(Editore e);
	Libro updLibro(Libro l);
	
	void deleteAutore(Autore a);
	void deleteEditore(Editore e);
	void deleteLibro(Libro l);
	
	
}
