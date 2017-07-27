package com.codnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Şeyma Yılmaz on 27.7.2017.
 */
@Entity
@Table(name = "tbl_person")
public class Person {

    @Id
    private int Id;

    @Column(name = "fullName")
    private String name;

    private int age;

    public Person() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
