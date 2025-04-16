package com.srajit.employeeservice.service.impl;

import com.srajit.employeeservice.dto.EmployeeDto;
import com.srajit.employeeservice.entity.Employee;
import lombok.AllArgsConstructor;
import com.srajit.employeeservice.mapper.AutoEmployeeMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.srajit.employeeservice.repository.EmployeeRepository;
import com.srajit.employeeservice.service.EmployeeService;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        return modelMapper.map(employeeRepository.save(employee), EmployeeDto.class);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(
        () -> new RuntimeException("Employee not found"));
        return modelMapper.map(employee, EmployeeDto.class);
    }
}
