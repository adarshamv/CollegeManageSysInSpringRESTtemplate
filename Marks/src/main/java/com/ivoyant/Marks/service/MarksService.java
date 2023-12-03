package com.ivoyant.Marks.service;

import com.ivoyant.Marks.entity.Marks;

public interface MarksService {

    Marks saveMarks(Marks marks);

    Marks getByUSN(String studentUSN);

}
