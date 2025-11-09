/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentrecordsystem;

/**
 *
 * @author Jassen
 */
public class StudentRecordSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        syudentbtx tree = new syudentbtx();

        // Insert Students
        tree.insert(102, "Alice");
        tree.insert(105, "Bob");
        tree.insert(101, "John");
        tree.insert(103, "Diana");

        // Display all
        tree.displayInOrder();

        // Search Example
        int searchID = 103;
        student result = tree.search(searchID);
        if (result != null)
            System.out.println("\nStudent Found: ID=" + result.id + ", Name=" + result.name);
        else
            System.out.println("\nStudent with ID " + searchID + " not found.");
    }
    }
    

