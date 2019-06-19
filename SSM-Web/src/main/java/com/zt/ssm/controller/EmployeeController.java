package com.zt.ssm.controller;

import com.ssm.po.Employee;
import com.zt.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")

public class EmployeeController {
    @Autowired
    @Qualifier("employeeService")
    private EmployeeService employeeService;

    @GetMapping("{employeeId}")
    public Employee showEmployeeById(@PathVariable Integer employeeId){
        return employeeService.getEmployeeById(employeeId);
    }


}
