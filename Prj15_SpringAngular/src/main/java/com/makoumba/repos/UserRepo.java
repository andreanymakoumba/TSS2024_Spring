package com.makoumba.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.makoumba.entities.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

	
}
