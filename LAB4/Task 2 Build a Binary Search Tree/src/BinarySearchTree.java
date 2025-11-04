/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VILLACORTA_CpE
 */
public class BinarySearchTree {
    BSTNode root;

   
    void insert(int value) {
        root = insertRec(root, value);
    }

    BSTNode insertRec(BSTNode node, int value) {
        if (node == null) {
            return new BSTNode(value);
        }
        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

   
    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(BSTNode node, int value) {
        if (node == null)
            return false;
        if (node.data == value)
            return true;
        else if (value < node.data)
            return searchRec(node.left, value);
        else
            return searchRec(node.right, value);
    }

    
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(BSTNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }
}


    
