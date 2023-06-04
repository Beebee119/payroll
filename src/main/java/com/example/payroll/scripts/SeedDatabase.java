package com.example.payroll.scripts;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.payroll.jpa.Employee;
import com.example.payroll.repositories.EmployeeRepository;

@Configuration
public class SeedDatabase {
    
    private static final Logger logger = 
    LoggerFactory.getLogger(SeedDatabase.class);

    @Bean
    CommandLineRunner initialDatabase(EmployeeRepository er) {
        return args -> {
            logger.info("Preloading " + er.save(new Employee("Name 1", "burglar")));
            logger.info("Preloading " + er.save(new Employee("Name 2", "chef")));
        };
    }
}
