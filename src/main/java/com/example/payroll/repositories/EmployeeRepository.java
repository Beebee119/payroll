package com.example.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.payroll.jpa.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JPA Repository consists of 30 methods that we can use already, including Create, Read, Update, Delete
    // inside the "<,>" bracket, we need to define the domain type and the id type, which are Employee and Long respectively
}
