package com.ivoyant.Department.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CollegeDepartmentDto {
    private CollegeDto collegeDto;
    private DepartmentDto departmentDto;
}
