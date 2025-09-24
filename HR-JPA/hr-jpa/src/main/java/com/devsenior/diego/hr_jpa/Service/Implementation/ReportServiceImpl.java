package com.devsenior.diego.hr_jpa.Service.Implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsenior.diego.hr_jpa.Entity.Employee;
import com.devsenior.diego.hr_jpa.Repository.EmployeeRepository;
import com.devsenior.diego.hr_jpa.Service.ReportService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ReportServiceImpl implements ReportService{

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
}
