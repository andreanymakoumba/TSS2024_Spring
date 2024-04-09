package com.savarino.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entites.Ricetta;

@Repository
public interface RicetteDAO extends JpaRepository<Ricetta, Integer> {

	List<Ricetta> findByIngredientiContains(String ingredienti); //DERIVED QUERY
}
