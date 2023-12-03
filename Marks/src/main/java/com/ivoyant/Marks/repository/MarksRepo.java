package com.ivoyant.Marks.repository;

import com.ivoyant.Marks.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarksRepo extends JpaRepository<Marks,String> {
}
