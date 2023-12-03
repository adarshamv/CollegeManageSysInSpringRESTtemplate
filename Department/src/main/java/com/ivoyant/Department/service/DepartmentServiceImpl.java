package com.ivoyant.Department.service;

import com.ivoyant.Department.dto.CollegeDepartmentDto;
import com.ivoyant.Department.dto.CollegeDto;
import com.ivoyant.Department.dto.DepartmentDto;
import com.ivoyant.Department.entity.Department;
import com.ivoyant.Department.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private RestTemplate restTemplate1;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public Department getDeptbyId(String deptId) {
        return departmentRepo.findById(deptId).get();
    }


    @Override
    public CollegeDepartmentDto getDepartmentWithCollege(String deptId) {
        CollegeDepartmentDto collegeDepartmentDto = new CollegeDepartmentDto();
        Department department = departmentRepo.findById(deptId).get();
        DepartmentDto departmentDto = mapToUser(department);

        ResponseEntity<CollegeDto> responseEntity =  restTemplate1
                .getForEntity("http://localhost:5555/api/College/getCollege/" + department.getCollegeId(),
                        CollegeDto.class);

        CollegeDto collegeDto = responseEntity.getBody();


        collegeDepartmentDto.setDepartmentDto(departmentDto);
        collegeDepartmentDto.setCollegeDto(collegeDto);

        return collegeDepartmentDto;
    }

    private DepartmentDto mapToUser(Department department) {
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDeptId(department.getDeptId());
        departmentDto.setDeptName(department.getDeptName());
        departmentDto.setCollegeId(department.getCollegeId());
        return departmentDto;
    }

}
