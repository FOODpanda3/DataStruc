/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.record.management.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class StudentRecordManagementSystem {

    static ArrayList<Student> studentList = new ArrayList<>();
    static HashMap<String, Student> studentMap = new HashMap<>();
    static Stack<String> undoStack = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

       
        loadData();

        int choice;
        do {
            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Grade");
            System.out.println("5. Remove Student");
            System.out.println("6. Sort Students by Name");
            System.out.println("7. Sort Students by Grade");
            System.out.println("8. Undo Last Action");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 ->
                    addStudent();
                case 2 ->
                    viewStudents();
                case 3 ->
                    searchStudent();
                case 4 ->
                    updateGrade();
                case 5 ->
                    removeStudent();
                case 6 ->
                    sortByName();
                case 7 ->
                    sortByGrade();
                case 8 ->
                    undoAction();
                case 9 -> {
                    saveData();
                    System.out.println("Data saved. Exiting program...");
                }
                default ->
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        if (studentMap.containsKey(id)) {
            System.out.println("Student ID already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Grade: ");
        double grade = sc.nextDouble();

        Student s = new Student(id, name, grade);
        studentList.add(s);
        studentMap.put(id, s);
        undoStack.push("ADD " + id);

        System.out.println("Student added successfully.");
    }

    static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        Student s = studentMap.get(id);
        System.out.println(s != null ? s : "Student not found.");
    }

    static void updateGrade() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        Student s = studentMap.get(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter New Grade: ");
        double newGrade = sc.nextDouble();

        undoStack.push("UPDATE " + id + " " + s.grade);
        s.grade = newGrade;

        System.out.println("Grade updated successfully.");
    }

    static void removeStudent() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        Student s = studentMap.remove(id);
        if (s != null) {
            studentList.remove(s);
            undoStack.push("REMOVE " + s.id + " " + s.name + " " + s.grade);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void sortByName() {
        studentList.sort(Comparator.comparing(stu -> stu.name));
        System.out.println("Students sorted by name.");
                viewStudents(); 
    }

    static void sortByGrade() {
      studentList.sort(Comparator.comparingDouble((Student stu) -> stu.grade).reversed());
        System.out.println("Students sorted by grade.");
                viewStudents(); 
    }

    static void undoAction() {
        if (undoStack.isEmpty()) {
            System.out.println("No actions to undo.");
            return;
        }

        String[] parts = undoStack.pop().split(" ");

        switch (parts[0]) {
            case "ADD" -> {
                Student s = studentMap.remove(parts[1]);
                studentList.remove(s);
                System.out.println("Undo add student.");
            }
            case "UPDATE" -> {
                Student s = studentMap.get(parts[1]);
                s.grade = Double.parseDouble(parts[2]);
                System.out.println("Undo update grade.");
            }
            case "REMOVE" -> {
                Student s = new Student(parts[1], parts[2], Double.parseDouble(parts[3]));
                studentList.add(s);
                studentMap.put(s.id, s);
                System.out.println("Undo remove student.");
            }
        }
    }

static final String FILE_NAME = "students.dat";

static void saveData() {
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
        out.writeObject(studentList);
    } catch (IOException e) {
        System.out.println("Error saving data.");
    }
}

static void loadData() {
    File file = new File(FILE_NAME);
    if (!file.exists()) return;

    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
        studentList = (ArrayList<Student>) in.readObject();
        for (Student s : studentList) {
            studentMap.put(s.id, s);
        }
        System.out.println("Saved data loaded successfully.");
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error loading data.");
    }
}
}
