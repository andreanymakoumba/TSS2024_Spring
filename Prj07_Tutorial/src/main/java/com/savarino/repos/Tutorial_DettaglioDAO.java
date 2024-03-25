package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Tutorial;
import com.savarino.entities.TutorialDetail;

public interface Tutorial_DettaglioDAO extends JpaRepository<TutorialDetail, Integer> {

}
