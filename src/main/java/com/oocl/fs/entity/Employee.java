package com.oocl.fs.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne
    private Company company;

    @OneToOne
    @JoinColumn(name = "record_id")
    private EmployeeRecord employeeRecord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
