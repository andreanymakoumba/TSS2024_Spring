package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entities.Libro;

@Repository
public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
