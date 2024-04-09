package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Test;

public interface TestDAO extends JpaRepository<Test, Integer> {

}
