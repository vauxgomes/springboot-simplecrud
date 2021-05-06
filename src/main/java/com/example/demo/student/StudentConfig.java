package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student s1 = new Student(
                    1L,
                    "Student",
                    "student@example.com",
                    LocalDate.of(2000, Month.JANUARY, 27)
            );

            Student s2 = new Student(
                    "Student 2",
                    "student2@example.com",
                    LocalDate.of(2003, Month.JANUARY, 27)
            );

            studentRepository.saveAll(List.of(s1,s2));
        };
    }
}
