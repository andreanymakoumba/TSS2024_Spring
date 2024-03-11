package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.SerieTV;
import com.savarino.services.SerieService;

@RestController
@RequestMapping("api")
public class SerieCtrl {
	
	@Autowired
	private SerieService service;
	
	@GetMapping("serie")
	public List<SerieTV> getAll(){
		return service.getSerie();
	}
	
	@PostMapping("serie")
	public SerieTV add(@RequestBody SerieTV s){
		return service.addSerie(s);
	}
}
