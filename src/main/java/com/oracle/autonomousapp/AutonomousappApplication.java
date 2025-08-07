package com.oracle.autonomousapp;

import com.oracle.autonomousapp.entity.User;
import com.oracle.autonomousapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutonomousappApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(AutonomousappApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // ✅ Use constructor with all arguments (or setters)
        User user = new User(null, "Manjit", "manjit@example.com");
        userRepository.save(user);
        System.out.println("Saved to Oracle Autonomous DB!");
    }
}
