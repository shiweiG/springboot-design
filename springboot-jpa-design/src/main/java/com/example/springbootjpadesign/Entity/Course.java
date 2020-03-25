package com.example.springbootjpadesign.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double low_score;
    private double max_score;
    @OneToMany(mappedBy = "course")
    private List<Elective>electives;
    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime;
    @Column(columnDefinition = "timestamp default current_timestamp " +
            "on update current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime updateTime;

}
