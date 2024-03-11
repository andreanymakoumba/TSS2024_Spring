package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entities.SerieTV;

@Repository
public interface SerieDAO extends JpaRepository<SerieTV, Integer> {

}
