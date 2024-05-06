package com.makoumba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.makoumba.entities.User;
import com.makoumba.repos.UserRepo;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

		@Autowired
		private UserRepo repo;
		
		//@RequestMapping (method = RequestMethod.GET)
		@GetMapping("users")
		public List<User> getUsers (){
			return (List<User>)repo.findAll(); // quel cast è dovuto al fatto che noi abbimo messo l'annotazione CrudRepo invece di JpaRepo
			
		}
		
		@PostMapping("users")
		public ResponseEntity<User> addUser(@RequestBody User user) {
			return new ResponseEntity<User> (repo.save(user), HttpStatus.CREATED);
		}
		
		
}
