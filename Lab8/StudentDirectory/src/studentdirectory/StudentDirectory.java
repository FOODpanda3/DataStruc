/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdirectory;

import java.util.HashMap;

public class StudentDirectory {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("01", new Student("01", "Alice", 90));
        students.put("02", new Student("02", "Bob", 85));
        students.put("03", new Student("03", "Charlie", 88));
        students.put("04", new Student("04", "Diana", 92));
        students.put("05", new Student("05", "Evan", 87));

        System.out.println("Retrieved Student:");
        System.out.println(students.get("03"));

        students.get("02").grade = 95;
        System.out.println("\nUpdated Grade:");
        System.out.println(students.get("02"));

        System.out.println("\nAll Students:");
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

}
