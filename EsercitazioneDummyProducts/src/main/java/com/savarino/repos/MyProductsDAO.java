package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entities.MyProduct;

@Repository
public interface MyProductsDAO extends JpaRepository<MyProduct, Integer> {

}
