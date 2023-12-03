package com.ivoyant.Marks.service;

import com.ivoyant.Marks.entity.Marks;
import com.ivoyant.Marks.repository.MarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksServiceImpl implements MarksService{

    @Autowired
    private MarksRepo marksRepo;
    @Override
    public Marks saveMarks(Marks marks) {
        double total=marks.getSem1Marks() + marks.getSem2Marks() + marks.getSem3Marks()+ marks.getSem4Marks();
        double p=(total/400)*100;
        marks.setPercentage(p);
        marks.setTotal(total);
        if(p>= 0 && p<35 ){
            marks.setResult("Fail");
        } else if (p>=35 && p<60) {
            marks.setResult("Pass");
        } else if (p>=60 && p<85) {
            marks.setResult("FirstClass");
        }
        else if(p>=85 && p<=100){
            marks.setResult("Distinction");
        }
        return marksRepo.save(marks);
    }

    @Override
    public Marks getByUSN(String studentUSN) {
        return marksRepo.findById(studentUSN).get();
    }
}
