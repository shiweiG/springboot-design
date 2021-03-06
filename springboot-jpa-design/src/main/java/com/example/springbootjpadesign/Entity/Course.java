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
    private Integer id;
    private String name;
    //权重
    private double credits;
    //最低分
    private double low_score;
    //最高分
    private double max_score;
    @OneToMany(mappedBy = "course")
    private List<Elective>electives;
    @ManyToOne
    private Teacher teacher;
    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime insertTime;

    public Course(String name,double credits){
        this.name=name;
        this.credits=credits;
    }

}
