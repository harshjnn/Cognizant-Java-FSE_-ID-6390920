package org.example.model;



import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;

    public Student(int i, String harshJain) {
    }

    public void setName(String harsh) {
    }

    public void setCity(String bhopal) {
    }

    // Getters and setters
}

