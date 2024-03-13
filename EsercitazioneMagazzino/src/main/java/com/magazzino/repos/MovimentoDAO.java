package com.magazzino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magazzino.entities.Movimento;

@Repository
public interface MovimentoDAO extends JpaRepository<Movimento, Integer> {

}
