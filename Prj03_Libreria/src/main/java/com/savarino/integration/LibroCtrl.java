package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Libro;
import com.savarino.service.LibroService;

@RestController
public class LibroCtrl {

	@Autowired
	private LibroService service;
	
	@CrossOrigin
	@GetMapping("api/libri")
	public List<Libro> getLibri(){
		return service.getLibri();
	}
}
