package com.ivoyant.Student.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StuDeptCollegeDto {
    private StudentDto studentDto;
    private DeptCollegeDto deptCollegeDto;
}
