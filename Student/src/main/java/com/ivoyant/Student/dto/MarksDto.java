package com.ivoyant.Student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MarksDto {

    private String studentUSN;
    private int sem1Marks;
    private int sem2Marks;
    private int sem3Marks;
    private int sem4Marks;
    private double total;
    private double percentage;
    private String result;
}
