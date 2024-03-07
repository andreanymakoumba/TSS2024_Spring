package com.serie.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serie.entities.Serie;

public interface SerieDAO extends JpaRepository<Serie, Integer> {

}