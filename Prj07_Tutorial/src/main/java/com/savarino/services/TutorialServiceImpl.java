package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Tutorial;
import com.savarino.repos.TutorialDAO;
import com.savarino.repos.Tutorial_DettaglioDAO;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	private TutorialDAO dao;
	
	@Autowired
	private Tutorial_DettaglioDAO daoDett;
	
	
	@Override
	public List<Tutorial> getTutorials() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Tutorial addTutorial(Tutorial t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

}
