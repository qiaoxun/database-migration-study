package com.qiao.flyway.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Clazz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clazz_generator")
    @SequenceGenerator(
            name = "clazz_generator",
            sequenceName = "clazz_sequence",
            allocationSize = 1
    )
    private Long id;

    private String name;
}
