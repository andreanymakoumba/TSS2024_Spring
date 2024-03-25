package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Tutorial;

public interface TutorialDAO extends JpaRepository<Tutorial, Integer> {

}
