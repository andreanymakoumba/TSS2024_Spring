package com.savarino.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.savarino.entities.Provincia;

public interface ProvinciaDAO extends JpaRepository<Provincia, Integer>{

	List<Provincia> findByRegione(String regione);//derived Query
	
	@Query(value = "select * from province order by totale desc", nativeQuery = true)
	List<Provincia> trovaProvinceOrdinatePerPopolazion();
}
