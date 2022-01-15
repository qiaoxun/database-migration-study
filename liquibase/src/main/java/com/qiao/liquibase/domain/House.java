package com.qiao.liquibase.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "house_generator")
    @SequenceGenerator(
            name = "house_generator",
            sequenceName = "house_sequence",
            allocationSize = 1
    )
    private Long id;

    private String owner;

    private Double price;

    private boolean fullyPaid;

}
