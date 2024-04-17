package com.savarino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Domanda;
import com.savarino.entities.Persona;
import com.savarino.entities.Test;
import com.savarino.repos.DomandaDAO;
import com.savarino.repos.PersonaDAO;
import com.savarino.repos.TestDAO;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private TestDAO testDAO;
	@Autowired
	private DomandaDAO domandaDAO;
	@Autowired
	private PersonaDAO personaDAO;

	
	@Override
	public Test addTest(Test t) {
		return testDAO.save(t);

	}

	@Override
	public Persona addPersona(Persona p) {
		return personaDAO.save(p);
	}

	@Override
	public Domanda addDomanda(Domanda d) {
		return domandaDAO.save(d);
	}

	@Override
	public List<Test> getTest() {
		return testDAO.findAll();
	}

	@Override
	public List<Persona> getPersone() {
		return personaDAO.findAll();
	}

	@Override
	public List<Domanda> getDomande() {
		return domandaDAO.findAll();
	}

	@Override
	public Persona getPersonaById(int i) {
		return personaDAO.findById(i).get();
	}

	@Override
	public void updatePersona(Persona p) {
		personaDAO.save(p);
	}

}
