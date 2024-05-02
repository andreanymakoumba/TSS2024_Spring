package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Appuntamenti;
import com.savarino.entities.Cliente;
import com.savarino.entities.Note_Cliente;
import com.savarino.entities.Opportunita;
import com.savarino.entities.Servizi_Consulenza;
import com.savarino.service.CRMService;


@RestController
@CrossOrigin
@RequestMapping("api")
public class CRMController {
	
	@Autowired
	private CRMService service;
	
	@GetMapping("clienti")
	public ResponseEntity<List<Cliente>> getAllClienti(){
		return new ResponseEntity<List<Cliente>>(service.getClienti(), HttpStatus.OK);
	}
	//Getmapping utende id TODO
	
	@PutMapping("clienti")
	public Cliente updateCliente(@RequestBody Cliente c) {
		return service.updateCliente(c);
	}
	@PostMapping("clienti")
	public Cliente addCliente(@RequestBody Cliente c) {
		return service.addCliente(c);
	}
	@DeleteMapping("clienti")
	public void deleteCliente(@RequestBody Cliente c) {
		service.deleteCliente(c);
	}
	
//	@GetMapping("clienti")
//	public List<Cliente> getAllClienti(){
//		return service.getClienti();
//	}
	
	@GetMapping("appuntamenti")
	public List<Appuntamenti> getAllAppuntamenti(){
		return service.getAppuntamenti();
	}
	
	@GetMapping("note-clienti")
	public List<Note_Cliente> getAllNotes(){
		return service.getNoteCliente();
	}
	
	@GetMapping("opportunita")
	public List<Opportunita> getAllOpportunities(){
		return service.getOpportunita();
	}
	
	@GetMapping("servizi-consulenza")
	public List<Servizi_Consulenza> getAllServiziConsulenza(){
		return service.getServiziConsulenza();
	}
}

