/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdirectory;

public class Student {

    String id;
    String name;
    double grade;

    Student(String id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return id + " | " + name + " | Grade: " + grade;
    }
}
