package com.ivoyant.Student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StuDeptDto {
    private StudentDto studentDto;
    private DepartmentDto departmentDto;
}
