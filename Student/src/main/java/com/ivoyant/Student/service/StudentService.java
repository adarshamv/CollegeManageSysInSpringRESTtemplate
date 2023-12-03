package com.ivoyant.Student.service;

import com.ivoyant.Student.dto.StuCollegeDto;
import com.ivoyant.Student.dto.StuDeptCollegeDto;
import com.ivoyant.Student.dto.StuDeptDto;
import com.ivoyant.Student.dto.StudentMarksDto;
import com.ivoyant.Student.entity.Student;

public interface StudentService {
    Student saveStudent(Student student);

    Student getStudentDetails(int studentId);

    StuDeptDto getStudentWithDepartment(int studentId);

    StuCollegeDto getStudentWithCollege(int studentId);

    StuDeptCollegeDto getStudentWithDeptAndCollege(int studentId);

    StudentMarksDto getStudentMarks(int studentId);
}
