package com.ivoyant.College.service;

import com.ivoyant.College.entity.College;
import com.ivoyant.College.repository.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CollegeServiceImpl implements CollegeService{
    @Autowired
    private CollegeRepo collegeRepo;

    @Override
    public College saveCollege(College college) {
        return collegeRepo.save(college);
    }

    @Override
    public College getCollegeById(String collegeId) {
        return collegeRepo.findById(collegeId).get();
    }
}
