package com.srajit.employeeservice.service;

import com.srajit.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee (EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long id);
}
