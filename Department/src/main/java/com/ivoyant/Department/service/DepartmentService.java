package com.ivoyant.Department.service;

import com.ivoyant.Department.dto.CollegeDepartmentDto;
import com.ivoyant.Department.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDeptbyId(String deptId);

    CollegeDepartmentDto getDepartmentWithCollege(String deptId);

}
