package com.application.springboot;

import com.application.springboot.Model.User;
import com.application.springboot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(SpringbootApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
			User user = new User();
			user.setUserName("Abilash");
			user.setAge(Long.parseLong("27"));
			user.setUserId(Long.parseLong("US1249"));
			userRepository.save(user);

			User user1 = new User();
			user1.setUserName("Kannan");
			user1.setAge(Long.parseLong("29"));
			user1.setUserId(Long.parseLong("US1250"));
			userRepository.save(user1);




	}
}
