package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Prenotazione;
import com.savarino.entities.Utente;
import com.savarino.entities.Viaggio;
import com.savarino.services.ViaggiAppService;

@RestController
@RequestMapping("api")
public class ViaggiAppCTRL {

	@Autowired
	ViaggiAppService service;
	
	@GetMapping("utenti")
	public List<Utente> getUtenti(){
		return service.getAllUtenti();
	}
	
	@PostMapping("utenti")
	public Utente addUtente(@RequestBody Utente u) {
		return service.addUtente(u);
	}
	
	@GetMapping("viaggi")
	public List<Viaggio> getViaggi(){
		return service.getAllViaggi();
	}
	
	@PostMapping("viaggi")
	public Viaggio addViaggio(@RequestBody Viaggio v) {
		return service.addViaggio(v);
	}
	
	@GetMapping("prenotazioni")
	public List<Prenotazione> getPrenotazioni(){
		return service.getAllPrenotazioni();
	}
	
	@PostMapping("prenotazioni")
	public Prenotazione addPrenotazioni(@RequestBody Prenotazione p) {
		return service.addPrenotazione(p);
	}
	
	
}
