package com.student.registration.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String email;
    private String dept;
    private String regno;



    public Student() {
    }

    public Student(Integer Id, String name, String email, String dept, String regno) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.regno = regno;
    }


    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRegno() {
        return this.regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }


    
    
    

    

}
