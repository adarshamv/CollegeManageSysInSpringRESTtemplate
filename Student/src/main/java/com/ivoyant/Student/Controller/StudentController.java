package com.ivoyant.Student.Controller;

import com.ivoyant.Student.dto.StuCollegeDto;
import com.ivoyant.Student.dto.StuDeptCollegeDto;
import com.ivoyant.Student.dto.StuDeptDto;
import com.ivoyant.Student.dto.StudentMarksDto;
import com.ivoyant.Student.entity.Student;
import com.ivoyant.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("addStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student data = studentService.saveStudent(student);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @GetMapping("getStudent/{id}")
    public ResponseEntity<Student> getStudentDetails(@PathVariable("id") int studentId){
        Student c=studentService.getStudentDetails(studentId);
        return ResponseEntity.ok(c);
    }
    @GetMapping("getStudentWithCollege/{studentId}")
    public ResponseEntity<StuCollegeDto> getStudentWithCollege(@PathVariable("studentId") int studentId){
        StuCollegeDto stuCollegeDto = studentService.getStudentWithCollege(studentId);
        return ResponseEntity.ok(stuCollegeDto);
    }

    @GetMapping("getStudentWithDept/{studentId}")
    public ResponseEntity<StuDeptDto> getStudentWithDepartment(@PathVariable("studentId") int studentId){
        StuDeptDto stuDeptDto = studentService.getStudentWithDepartment(studentId);
        return ResponseEntity.ok(stuDeptDto);
    }

    @GetMapping("getStudentWithDeptAndCollege/{studentId}")
    public ResponseEntity<StuDeptCollegeDto> getStudentWithDeptAndCollege(@PathVariable("studentId") int studentId){
        StuDeptCollegeDto stuDeptCollegeDto = studentService.getStudentWithDeptAndCollege(studentId);
        return ResponseEntity.ok(stuDeptCollegeDto);
    }

    @GetMapping("getStudentMarks/{studentId}")
    public ResponseEntity<StudentMarksDto> getStudentMarks(@PathVariable("studentId") int studentId){
        StudentMarksDto studentMarksDto = studentService.getStudentMarks(studentId);
        return ResponseEntity.ok(studentMarksDto);
    }

}
