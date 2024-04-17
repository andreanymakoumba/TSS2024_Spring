package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Portata;

public interface PortateDAO extends JpaRepository<Portata, Integer> {

}
