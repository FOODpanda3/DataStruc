/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heightandleafcounter;

/**
 *
 * @author Jassen
 */
public class studentbts {

    student root;

    // Insert new student
    void insert(int id, String name) {
        root = insertRec(root, id, name);
    }

    private student insertRec(student root, int id, String name) {
        if (root == null) {
            return new student(id, name);
        }

        if (id < root.id) {
            root.left = insertRec(root.left, id, name);
        } else if (id > root.id) {
            root.right = insertRec(root.right, id, name);
        }

        return root;
    }

    // Display all students (Inorder)
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

    int findHeight() {
        return heightRec(root);
    }

    private int heightRec(student node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(heightRec(node.left), heightRec(node.right));
    }

    int countLeaves() {
        return countLeavesRec(root);
    }

    private int countLeavesRec(student node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeavesRec(node.left) + countLeavesRec(node.right);
    }
}
