package com.savarino.services;

import java.util.List;

import com.savarino.entities.Tutorial;

public interface TutorialService {

	List<Tutorial> getTutorials();
	
	Tutorial addTutorial(Tutorial t);
}
