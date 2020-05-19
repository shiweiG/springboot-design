package com.example.springbootjpadesign.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private  String  stu_number;
    @OneToOne
    @MapsId
    private User user;
    @OneToMany(mappedBy = "student")
    private List<Elective>electives;
    @ManyToOne
    private Teacher teacher;
    @OneToMany(mappedBy = "student")
    private List<Direction>directions;

    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime;


}
