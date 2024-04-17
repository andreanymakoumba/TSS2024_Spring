package com.savarino.IL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.portate.Pizza;
import com.savarino.services.PizzeriaService;

@RestController
@RequestMapping("api")
public class PizzeriaRest {

	@Autowired
	private PizzeriaService service;
	
	@GetMapping("pizze")
	ResponseEntity<List<Pizza>> getPizze(){
		return new ResponseEntity<List<Pizza>>(service.getPizze(), HttpStatus.OK);
	}
	
}
