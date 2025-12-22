/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem1student.management.system;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Jassen
 */
public class Problem1StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();

        students.add(new student(101, "Daryl", 89.5));
        students.add(new student(102, "Yuls", 92.0));
        students.add(new student(103, "Lian", 85.0));

        int searchId = 102;
        for (student s : students) {
            if (s.id == searchId) {
                System.out.println("Found: " + s);
            }
        }

        students.removeIf(s -> s.id == 101);

        students.sort(Comparator.comparing(s -> s.name));

        students.sort(Comparator.comparingDouble(s -> s.grade));

        System.out.println("Student List:");
        for (student s : students) {
            System.out.println(s);
        }
    }
}
