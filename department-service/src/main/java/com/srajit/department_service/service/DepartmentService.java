package com.srajit.department_service.service;

import com.srajit.department_service.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentbyId(Long id);
    DepartmentDto getDepartmentbyCode(String departmentCode);
}
