package com.srajit.department_service.mapper;

import com.srajit.department_service.dto.DepartmentDto;
import com.srajit.department_service.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AutoDepartmentMapper {

    AutoDepartmentMapper MAPPER = Mappers.getMapper(AutoDepartmentMapper.class);

    DepartmentDto mapToDepartmentDto (Department department);
    Department mapToDepartment (DepartmentDto departmentDto);
}
