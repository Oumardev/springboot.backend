package com.oumardev.springstart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oumardev.springstart.domaine.User;
import com.oumardev.springstart.services.UserService;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {

	private final UserService userService;

	public SpringstartApplication(UserService userService){
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringstartApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{
		User a1 = new User("CISSE","Alpha",12);

		System.out.println("Employe info: "+ userService.save(a1));
	}

}
