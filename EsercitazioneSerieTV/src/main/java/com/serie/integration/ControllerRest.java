package com.serie.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serie.entities.Serie;
import com.serie.services.SerieService;

@RestController 
@RequestMapping("api")
public class ControllerRest {
	
	@Autowired
	private SerieService service;

	@CrossOrigin()
	@GetMapping("api/serie")
	
	public List<Serie> getSerie(){
		return service.getSerie();		
	}
	
	@PostMapping("api/serie")
	public Serie addSerie(@RequestBody Serie s) {
		service.addSerie(s);
		return s;
	}
	
	
}