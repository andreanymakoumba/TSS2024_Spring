package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
