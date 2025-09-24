package com.devsenior.diego.hr_jpa.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsenior.diego.hr_jpa.Entity.Employee;
import com.devsenior.diego.hr_jpa.Service.ReportService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/hr/reports")
public class ReportController {

    private final ReportService reportService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return reportService.getAllEmployees();
    }
    
}
