package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entities.MioProdotto;

@Repository
public interface MioProdottoDAO extends JpaRepository<MioProdotto, Integer> {

}
