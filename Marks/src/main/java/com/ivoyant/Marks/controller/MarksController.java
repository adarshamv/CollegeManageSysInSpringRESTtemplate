package com.ivoyant.Marks.controller;

import com.ivoyant.Marks.entity.Marks;
import com.ivoyant.Marks.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/marks/")
public class MarksController {
    @Autowired
    private MarksService marksService;

    @PostMapping("addMarks")
    public ResponseEntity<Marks> saveMarks(@RequestBody Marks marks) {
        Marks data = marksService.saveMarks(marks);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }
    @GetMapping("getByUSN/{usn}")
    public ResponseEntity<Marks> getByUSN(@PathVariable("usn") String studentUSN){
        Marks c=marksService.getByUSN(studentUSN);
        return ResponseEntity.ok(c);
    }


}
