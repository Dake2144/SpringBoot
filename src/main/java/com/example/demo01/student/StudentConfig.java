package com.example.demo01.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student daulet = new Student(
                    "Daulet",
                    "sametbay@gmail.com",
                    LocalDate.of(1996, Month.APRIL, 2)
            );
            Student bob = new Student(

                    "Bob",
                    "Smith@gmail.com",
                    LocalDate.of(1995, Month.APRIL, 2)
            );
            Student maria = new Student(
                    "Maria",
                    "lopes@gmail.com",
                    LocalDate.of(1998, Month.APRIL, 2)
            );
            repository.saveAll(
                    List.of(daulet , bob, maria)
            );
        };
    }
}

