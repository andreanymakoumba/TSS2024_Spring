package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {

}
