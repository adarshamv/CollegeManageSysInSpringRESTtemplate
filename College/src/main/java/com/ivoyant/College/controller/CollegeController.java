package com.ivoyant.College.controller;

import com.ivoyant.College.entity.College;
import com.ivoyant.College.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/College/")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @PostMapping("addCollege")
    public ResponseEntity<College> saveCollege(@RequestBody College college){
        College college1=collegeService.saveCollege(college);
        return new ResponseEntity<>(college1, HttpStatus.CREATED);
    }

    @GetMapping("getCollege/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable("id") String collegeId){
        College c=collegeService.getCollegeById(collegeId);
        return ResponseEntity.ok(c);
    }

}
