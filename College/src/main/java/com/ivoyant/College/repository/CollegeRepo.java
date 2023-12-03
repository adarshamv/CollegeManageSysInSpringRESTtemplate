package com.ivoyant.College.repository;

import com.ivoyant.College.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College,String> {
}
