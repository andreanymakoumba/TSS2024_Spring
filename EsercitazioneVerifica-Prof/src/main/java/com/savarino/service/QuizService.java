package com.savarino.service;

import java.util.List;

import com.savarino.entities.Domanda;
import com.savarino.entities.Persona;
import com.savarino.entities.Test;

public interface QuizService {

	Test addTest(Test t);
	Persona addPersona(Persona p);
	Domanda addDomanda(Domanda d);
	
	List<Test> getTest();
	List<Persona> getPersone();
	List<Domanda> getDomande();
	Persona getPersonaById(int i);
	void updatePersona(Persona p);
	
}
