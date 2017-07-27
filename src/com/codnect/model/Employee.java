package com.codnect.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Şeyma Yılmaz on 26.7.2017.
 */
@Entity
public class Employee {

    @Id
    private int id;

    private String name;

    private int salary;

    public Employee() {
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
