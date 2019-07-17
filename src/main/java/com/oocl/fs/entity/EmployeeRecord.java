package com.oocl.fs.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee_record")
public class EmployeeRecord {

    @Id
    @GeneratedValue
    private int id;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

