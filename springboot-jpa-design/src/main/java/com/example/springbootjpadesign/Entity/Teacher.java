package com.example.springbootjpadesign.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int  tea_number;
    @OneToOne
    @MapsId
    private User user;
    private Integer quantity;
    private Integer ranges;
    @OneToMany(mappedBy = "teacher")
    private List<Course>courses;
    @OneToMany(mappedBy = "teacher")
    private List<Student>students;

    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime;
    @Column(columnDefinition = "timestamp default current_timestamp " +
            "on update current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime updateTime;
    public Teacher(String name,int number){
        this.name=name;
        this.tea_number=number;
    }
}
