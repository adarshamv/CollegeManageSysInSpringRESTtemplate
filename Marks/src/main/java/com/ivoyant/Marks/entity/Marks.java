package com.ivoyant.Marks.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Marks")
public class Marks {
    @Id
    private String studentUSN;
    private int sem1Marks;
    private int sem2Marks;
    private int sem3Marks;
    private int sem4Marks;
    private double total;
    private double percentage;
    private String result;

}
