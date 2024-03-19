package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
