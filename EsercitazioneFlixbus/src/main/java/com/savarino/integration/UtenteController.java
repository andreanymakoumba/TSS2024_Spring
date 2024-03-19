package com.savarino.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.savarino.services.UtenteService;

@Controller
public class UtenteController {

	@Autowired
	private UtenteService service;
	
	
}
