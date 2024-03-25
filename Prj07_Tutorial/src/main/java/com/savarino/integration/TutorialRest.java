package com.savarino.integration;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Tutorial;
import com.savarino.services.TutorialService;

@RestController
@RequestMapping("api")
public class TutorialRest {

	TutorialService service;
	
	
	@GetMapping("all")
	public ResponseEntity<List<Tutorial>> getAll(){
		return ResponseEntity.ok(service.getTutorials());
	}
}
