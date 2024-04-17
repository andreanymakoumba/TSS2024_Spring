package com.savarino;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.savarino.entities.Domanda;
import com.savarino.entities.Persona;
import com.savarino.service.QuizService;

@SpringBootTest
class EsercitazioneVerificaProfApplicationTests {

	
	@Autowired
	private QuizService service;
	
	@Test
	@DisplayName("test domande")
	void getDomande() {
		List<Domanda> domande = service.getDomande();
		int size = domande.size();
		
		assertTrue(size == 3);
		assertFalse(size != 3);
		
		}
	@Test
	void getPersone() {
	}
	@Test
	void getTest() {
	}
	@Test
	void addDomanda() {
	}
	
	
	@Test
	void updatePersona() {
		
		//1) chiamo il service e mi faccio dare la persona 1
		Persona p = service.getPersonaById(1);
		//2) modifico la persona 1
		p.setPunteggio(1000);
		//3) attraverso il service salvo la persona 1 sul DB
		service.updatePersona(p);
		//4) chiamo ilservice e mi faccio dare nuovamente la persona 1
		p = service.getPersonaById(1);
		//5) asserisco che il punteggio sia uguale a 1000
		assertTrue(p.getPunteggio()==1000);
	}
	
	@Test
	void getPersonaById() {
		Persona personaById = service.getPersonaById(1);
	}

	
	
}
