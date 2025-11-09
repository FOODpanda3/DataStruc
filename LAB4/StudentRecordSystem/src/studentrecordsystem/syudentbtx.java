/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrecordsystem;

/**
 *
 * @author Jassen
 */
public class syudentbtx {

    student root;

     void insert(int id, String name) {
        root = insertRec(root, id, name);
    }

    private student insertRec(student root, int id, String name) {
        if (root == null) {
            root = new student(id, name);
            return root;
        }

        if (id < root.id) {
            root.left = insertRec(root.left, id, name);
        } else if (id > root.id) {
            root.right = insertRec(root.right, id, name);
        } else {
            System.out.println("Student ID already exists!");
        }

        return root;
    }
     student search(int id) {
        return searchRec(root, id);
    }

    private student searchRec(student root, int id) {
        if (root == null || root.id == id)
            return root;

        if (id < root.id)
            return searchRec(root.left, id);

        return searchRec(root.right, id);
    }
    void displayInOrder() {
        System.out.println("\nStudent Records (sorted by ID):");
        inorderRec(root);
    }

    private void inorderRec(student root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("ID: " + root.id + " | Name: " + root.name);
            inorderRec(root.right);
        }
    }
}
