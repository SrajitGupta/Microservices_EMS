package com.srajit.department_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table (name = "departments")
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String departmentName;
private String departmentDescription;
private String departmentCode;
}
