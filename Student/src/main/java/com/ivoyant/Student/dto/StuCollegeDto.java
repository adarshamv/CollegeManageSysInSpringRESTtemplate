package com.ivoyant.Student.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StuCollegeDto {

    private StudentDto studentDto;
    private CollegeDto collegeDto;

}
