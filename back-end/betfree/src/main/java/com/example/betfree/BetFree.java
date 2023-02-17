package com.example.betfree;

import com.example.betfree.entities.User;
import com.example.betfree.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BetFree implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BetFree.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String...args) throws Exception {
		User user = new User();
		user.setUsername("Makarov");
		user.setEmail("makar@abv.bg");
		user.setPassword("makarov123");
		this.userRepository.save(user);
	}
}
