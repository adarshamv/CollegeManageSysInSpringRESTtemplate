package com.ivoyant.Student.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_details")
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String studentUSN;
    private String collegeId;
    private String deptId;

}
