package com.ansavarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ansavarino.entities.Gioco;
import com.ansavarino.services.GiocoService;

@RestController
public class ControllerRest {
	
	@Autowired
	private GiocoService service;
	
	@CrossOrigin()
	@GetMapping("/api/giochi")
	public List<Gioco> getGiochi(){
		return service.getGiochi();
	}
	@GetMapping("/api/giochi/{id}")
	public Gioco getGiochiById(@PathVariable int id){
		return service.getGiochi()
					  .stream()
					  .filter(g->g.getId()==id)
					  .findFirst()
					  .get();
	}
	
	@PostMapping("api/giochi")
	public Gioco addGioco(@RequestBody Gioco g){
		service.addGioco(g);
		return g;
	}
	
}
