package com.ivoyant.Department.repository;

import com.ivoyant.Department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,String> {

}
