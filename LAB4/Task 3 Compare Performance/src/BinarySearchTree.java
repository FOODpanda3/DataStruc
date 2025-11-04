/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VILLACORTA_CpE
 */
public class BinarySearchTree {

    node root;
    int comp;

    void insert(int value) {
        root = insertRec(root, value);
    }

    node insertRec(node node, int value) {
        if (node == null) {
            return new node(value);
        }
        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }
    boolean search (int value){
    comp = 0;
        return searchRec(root, value);
    }
     boolean searchRec(node node, int value) {
        comp++;
        if (node == null) {
            return false;
        }
        if (node.data == value) {
            return true;
        } else if (value < node.data) {
            return searchRec(node.left, value);
        } else {
            return searchRec(node.right, value);
        }
    }
}
    

