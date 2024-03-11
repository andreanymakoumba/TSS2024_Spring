package com.savarino;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.savarino.entities.SerieTV;
import com.savarino.services.SerieService;

@SpringBootTest
class Prj04EsercitazioneSerieTvApplicationTests {

	@Autowired
	private SerieService service;
	
	
	@Test
	void contextLoads() {
		
		SerieTV s = new SerieTV();
		s.setTitle("prova test");
		SerieTV aggiunta=service.addSerie(s);
		System.out.println(aggiunta);
		assertTrue(aggiunta.getTitle().startsWith("grova"));
		
	}
	
	@Test
	void delSerie() {
		System.out.println(service.getSerieById(5));
		service.deleteSerie(5);
		System.out.println(service.getSerieById(5));
		
	}

}
