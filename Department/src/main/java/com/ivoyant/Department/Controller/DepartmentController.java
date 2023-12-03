package com.ivoyant.Department.Controller;


import com.ivoyant.Department.dto.CollegeDepartmentDto;
import com.ivoyant.Department.entity.Department;
import com.ivoyant.Department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department/")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("addDepartment")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        Department data = departmentService.saveDepartment(department);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @GetMapping("getDept/{id}")
    public ResponseEntity<Department> getDeptbyId(@PathVariable("id") String deptId){
        Department c=departmentService.getDeptbyId(deptId);
        return ResponseEntity.ok(c);
    }

    @GetMapping("getDeptwithCollege/{deptId}")
    public ResponseEntity<CollegeDepartmentDto> getDepartmentWithCollege(@PathVariable("deptId") String deptId){
        CollegeDepartmentDto collegeDepartmentDto = departmentService.getDepartmentWithCollege(deptId);
        return ResponseEntity.ok(collegeDepartmentDto);
    }


}