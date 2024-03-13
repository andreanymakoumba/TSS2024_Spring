package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Film;
import com.savarino.repos.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDAO dao;
	
	@Override
	public List<Film> getFilms() {
		return dao.findAll();
	}

	@Override
	public List<Film> getFilmByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film getFilmById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film addFilm(Film f) {
		return dao.save(f);
	}

	@Override
	public Film updateFilm(Film f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFilm(Film f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFilm(int id) {
		// TODO Auto-generated method stub

	}

}
