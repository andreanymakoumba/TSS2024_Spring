package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entites.Ricetta;
import com.savarino.services.RicettaService;

@RestController
public class RicetteRest {

	@Autowired
	RicettaService service;
	
	@GetMapping("ricette")
	public List<Ricetta> getAll(){
		return service.getRicette();
	}
	
	@GetMapping("ricette/{ingrediente}")
	public List<Ricetta> getByIngrediente(@PathVariable String ingrediente){
		return service.getRicetteByIngredienti(ingrediente);
	}
	
	@PostMapping("ricette")
	public Ricetta addRicetta(@RequestBody Ricetta r) {
		return service.addRicetta(r);
	}
	
	@PutMapping("ricette")
	public Ricetta updateRicetta(@RequestBody Ricetta r) {
		return service.updateRicetta(r);
	}
}
