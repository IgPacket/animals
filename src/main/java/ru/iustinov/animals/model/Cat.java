package ru.iustinov.animals.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cat", length = Integer.MAX_VALUE)
    private String cat;

    @Column(name = "age")
    private Integer age;

    @Column(name = "color", length = Integer.MAX_VALUE)
    private String color;

    @Column(name = "gender", length = Integer.MAX_VALUE)
    private String gender;

}