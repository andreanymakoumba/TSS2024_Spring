package com.savarino.integration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Film;
import com.savarino.services.FilmService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class FilmCtrl {

	@Autowired
	private FilmService service;
	
	@GetMapping("film")
	public List<Film> getFilm() {
		return service.getFilms();
	}
	
	@PostMapping("film")
	public Film add(@RequestBody Film f){
		return service.addFilm(f);
	}
}
