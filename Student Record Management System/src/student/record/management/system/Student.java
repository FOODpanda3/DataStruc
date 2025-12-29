package student.record.management.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    String id;
    String name;
    double grade;

    public Student(String id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Grade: " + grade;
    }
}