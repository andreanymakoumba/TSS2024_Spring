package com.savarino.services;

import java.util.List;

import com.savarino.entities.Film;

public interface FilmService {

	List<Film> getFilms();
	List<Film> getFilmByTitolo(String titolo);
	
	Film getFilmById(int id);
	Film addFilm(Film f);
	
	Film updateFilm(Film f);
	
	void deleteFilm(Film f); 
	void deleteFilm(int id); 
}
