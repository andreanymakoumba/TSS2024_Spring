package com.savarino.services;

import java.util.List;

import com.savarino.entities.Domanda;
import com.savarino.entities.DomandaTest;
import com.savarino.entities.Persona;
import com.savarino.entities.Test;

public interface QuizService {

	//TEST
	Test addTest(Test t);
	List<Test> getAllTests();
	void deleteTest(Test t);
	Test updateTest(Test t);
	Test getTestById(int id);

	//Domanda
	Domanda addDomanda(Domanda d);
	List<Domanda> getAllDomande();
	void deleteDomanda(Domanda d);
	Domanda updateDomanda(Domanda d);
	Domanda getDomandaById(int id);

	//Persona
	Persona addPersona(Persona p);
	List<Persona> getAllPersone();
	void deletePersona(Persona p);
	Persona updatePersona(Persona p);
	Persona getPersonaById(int id);
	
	//DomandaTest
	List<DomandaTest> getAllDomandeTest();
	DomandaTest getDomandaTestById(int id);
	void deleteDomandaTest(DomandaTest dt);
	DomandaTest updateDomandaTest(DomandaTest dt);
	DomandaTest addDomandaTest(DomandaTest dt);
}
