package com.ivoyant.Student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentMarksDto {
    private StudentDto studentDto;

    private MarksDto marksDto;

}
