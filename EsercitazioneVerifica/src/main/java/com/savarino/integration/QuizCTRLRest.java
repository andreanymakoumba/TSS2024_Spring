package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Domanda;
import com.savarino.entities.DomandaTest;
import com.savarino.entities.Persona;
import com.savarino.entities.Test;
import com.savarino.services.QuizService;

@RestController
@RequestMapping("api")
public class QuizCTRLRest {

	@Autowired
	QuizService service;
	
	@GetMapping("test")
	public List<Test> getTests(){
		return service.getAllTests();
	}
	
	@PostMapping("test")
	public Test addTest(@RequestBody Test t) {
		return service.addTest(t);
	}
	
	@GetMapping("domanda")
	public List<Domanda> getDomande(){
		return service.getAllDomande();
	}
	
	@PostMapping("domanda")
	public Domanda addDomanda(@RequestBody Domanda d) {
		return service.addDomanda(d);
	}
	
	@GetMapping("persona")
	public List<Persona> getPersone(){
		return service.getAllPersone();
	}
	
	@PostMapping("persona")
	public Persona addPersona(@RequestBody Persona p) {
		return service.addPersona(p);
	}
	
	@GetMapping("domandatest")
	public List<DomandaTest> getDomandeTest(){
		return service.getAllDomandeTest();
	}
	
	@PostMapping("domandatest")
	public DomandaTest addDomandaTest(@RequestBody DomandaTest dt) {
		return service.addDomandaTest(dt);
	}
}
