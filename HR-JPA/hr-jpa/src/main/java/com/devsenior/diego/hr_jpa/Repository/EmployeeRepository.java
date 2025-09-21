package com.devsenior.diego.hr_jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsenior.diego.hr_jpa.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}
