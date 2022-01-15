package com.qiao.liquibase.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
    @SequenceGenerator(
            name = "item_generator",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    private Long id;

    private String name;

    @ManyToOne
    private House house;

}
