package com.mysql.curd.employee.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "emp")
@Entity
public class Employee {

    //primary key with auto generate
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private double salary;
    private int age;
}
