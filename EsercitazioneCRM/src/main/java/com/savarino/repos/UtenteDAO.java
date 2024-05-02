package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entities.Utente;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
