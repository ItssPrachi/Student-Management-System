package com.prachi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String course;
    private String email; // ✅ Email field

    // --- Getters and Setters ---

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

    public int getAge() { 
        return age; 
    }

    public void setAge(int age) { 
        this.age = age; 
    }

    public String getCourse() { 
        return course; 
    }

    public void setCourse(String course) { 
        this.course = course; 
    }

    public String getEmail() {              // ✅ Getter
        return email;
    }

    public void setEmail(String email) {    // ✅ Setter
        this.email = email;
    }
}
