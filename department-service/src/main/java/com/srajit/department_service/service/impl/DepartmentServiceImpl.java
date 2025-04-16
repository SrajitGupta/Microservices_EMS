package com.srajit.department_service.service.impl;

import com.srajit.department_service.DepartmentServiceApplication;
import com.srajit.department_service.dto.DepartmentDto;
import com.srajit.department_service.entity.Department;
import com.srajit.department_service.mapper.AutoDepartmentMapper;
import com.srajit.department_service.repository.DepartmentRepository;
import com.srajit.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(departmentRepository.save(department));
    }

    @Override
    public DepartmentDto getDepartmentbyId(Long id) {

        Department department = departmentRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Department not found")
        );
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);
    }

    @Override
    public DepartmentDto getDepartmentbyCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);
    }
}
