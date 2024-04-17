package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Cliente;

public interface ClientiDAO extends JpaRepository<Cliente, Integer> {

}
