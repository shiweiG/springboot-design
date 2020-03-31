package com.example.springbootjpadesign.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Elective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    private double grade;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
}
