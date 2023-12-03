package com.ivoyant.Student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeId;
    private String deptId;
    private String studentUSN;

}
