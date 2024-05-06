package com.makoumba;

import java.util.stream.Stream;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.makoumba.entities.User;
import com.makoumba.repos.UserRepo;

@SpringBootApplication
public class Pr15SpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pr15SpringAngularApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepo repo) {
		return args -> {
			Stream
			.of("galileo", "newton", "einstein", "curie")
			.forEach (scienziato ->{
				User user = new User();
				user.setUsername(scienziato);
				user.setEmail(scienziato + "@immaginazioneelavoro.it");
				repo.save(user);
			});
			repo.findAll().forEach(System.out::println);
		};
	}
}
