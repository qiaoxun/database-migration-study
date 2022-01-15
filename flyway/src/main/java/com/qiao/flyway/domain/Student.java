package com.qiao.flyway.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
    @SequenceGenerator(
            name = "student_generator",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    private Long id;

    private String name;

    @ManyToOne
    private Clazz clazz;
}
