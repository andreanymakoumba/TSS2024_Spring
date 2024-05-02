package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Appuntamenti;

public interface AppuntamentiDAO extends JpaRepository<Appuntamenti, Integer> {

}
