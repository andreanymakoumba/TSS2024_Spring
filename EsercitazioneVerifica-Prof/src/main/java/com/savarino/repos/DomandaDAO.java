package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Domanda;

public interface DomandaDAO extends JpaRepository<Domanda, Integer> {

}
