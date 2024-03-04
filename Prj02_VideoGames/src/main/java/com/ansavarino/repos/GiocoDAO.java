package com.ansavarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ansavarino.entities.Gioco;

@Repository
public interface GiocoDAO extends JpaRepository<Gioco, Integer> {

}
