package com.ivoyant.Student.service;


import com.ivoyant.Student.dto.*;
import com.ivoyant.Student.entity.Student;
import com.ivoyant.Student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentDetails(int studentId) {
        return studentRepo.findById(studentId).get();
    }

    @Override
    public StuCollegeDto getStudentWithCollege(int studentId) {
        StuCollegeDto stuCollegeDto=new StuCollegeDto();

        Student student=studentRepo.findById(studentId).get();

        StudentDto studentDto=mapToStudent(student);

        ResponseEntity<CollegeDto> responseEntity =  restTemplate
                .getForEntity("http://localhost:5555/api/College/getCollege/" + student.getCollegeId(),
                        CollegeDto.class);

        CollegeDto collegeDto = responseEntity.getBody();

        stuCollegeDto.setStudentDto(studentDto);
        stuCollegeDto.setCollegeDto(collegeDto);

       return stuCollegeDto;

    }
    private StudentDto mapToStudent(Student student) {
        StudentDto studentDto=new StudentDto();
        studentDto.setStudentId(student.getStudentId());
        studentDto.setStudentName(student.getStudentName());
        studentDto.setStudentAddress(student.getStudentAddress());
        studentDto.setStudentUSN(student.getStudentAddress());
        studentDto.setCollegeId(student.getCollegeId());
        studentDto.setDeptId(student.getDeptId());
        return studentDto;
    }

    @Override
    public StuDeptDto getStudentWithDepartment(int studentId) {

        StuDeptDto stuDeptDto=new StuDeptDto();

        Student student=studentRepo.findById(studentId).get();

        StudentDto studentDto=mapToStudent(student);

        ResponseEntity<DepartmentDto> responseEntity =  restTemplate
                .getForEntity("http://localhost:4444/api/department/getDept/" + student.getDeptId(),
                        DepartmentDto.class);

        DepartmentDto departmentDto = responseEntity.getBody();

        stuDeptDto.setStudentDto(studentDto);
        stuDeptDto.setDepartmentDto(departmentDto);

        return stuDeptDto;

    }


    @Override
    public StuDeptCollegeDto getStudentWithDeptAndCollege(int studentId) {
        StuDeptCollegeDto stuDeptCollegeDto=new StuDeptCollegeDto();
        Student student=studentRepo.findById(studentId).get();

        StudentDto studentDto=mapToStudent(student);

        ResponseEntity<DeptCollegeDto> responseEntity =  restTemplate
                .getForEntity("http://localhost:4444/api/department/getDeptwithCollege/" + student.getDeptId(),
                        DeptCollegeDto.class);

        DeptCollegeDto deptCollegeDto = responseEntity.getBody();


        stuDeptCollegeDto.setStudentDto(studentDto);
        stuDeptCollegeDto.setDeptCollegeDto(deptCollegeDto);


        return stuDeptCollegeDto;
    }

    @Override
    public StudentMarksDto getStudentMarks(int studentId) {
        StudentMarksDto studentMarksDto=new StudentMarksDto();
        Student student=studentRepo.findById(studentId).get();

        StudentDto studentDto=mapToStudent(student);
        ResponseEntity<MarksDto> responseEntity =restTemplate
                .getForEntity("http://localhost:7777/api/marks/getByUSN/"+student.getStudentUSN(),
                        MarksDto.class);

        MarksDto marksDto=responseEntity.getBody();

        studentMarksDto.setStudentDto(studentDto);
        studentMarksDto.setMarksDto(marksDto);

        return studentMarksDto;
    }
}
