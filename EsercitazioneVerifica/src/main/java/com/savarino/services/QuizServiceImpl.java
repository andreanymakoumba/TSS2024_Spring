package com.savarino.services;

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
public class QuizServiceImpl implements QuizService{

	@Autowired
	TestDAO daoT;
	
	@Autowired
	DomandaDAO daoD;
	
	@Autowired
	PersonaDAO daoP;
	
	@Override
	public Test addTest(Test t) {
		return daoT.save(t);
	}

	@Override
	public List<Test> getAllTests() {
		return daoT.findAll();
	}

	@Override
	public void deleteTest(Test t) {
		daoT.delete(t);
	}

	@Override
	public Test updateTest(Test t) {
		return daoT.save(t);
	}

	@Override
	public Test getTestById(int id) {
		return daoT.findById(id).get();
	}

	@Override
	public Domanda addDomanda(Domanda d) {
		return daoD.save(d);
	}

	@Override
	public List<Domanda> getAllDomande() {
		return daoD.findAll();
	}

	@Override
	public void deleteDomanda(Domanda d) {
		daoD.delete(d);
	}

	@Override
	public Domanda updateDomanda(Domanda d) {
		return daoD.save(d);
	}

	@Override
	public Domanda getDomandaById(int id) {
		return daoD.findById(id).get();
	}

	@Override
	public Persona addPersona(Persona p) {
		return daoP.save(p);
	}

	@Override
	public List<Persona> getAllPersone() {
		return daoP.findAll();
	}

	@Override
	public void deletePersona(Persona p) {
		daoP.delete(p);
	}

	@Override
	public Persona updatePersona(Persona p) {
		return daoP.save(p);
	}

	@Override
	public Persona getPersonaById(int id) {
		return daoP.findById(id).get();
	}

}
