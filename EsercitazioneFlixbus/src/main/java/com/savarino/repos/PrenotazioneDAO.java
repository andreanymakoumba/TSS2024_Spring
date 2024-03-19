package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
