package com.ivoyant.College.service;

import com.ivoyant.College.entity.College;

import java.util.Optional;

public interface CollegeService {
    College saveCollege(College college);

    College getCollegeById(String collegeId);
}
