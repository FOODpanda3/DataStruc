/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VILLACORTA_CpE
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        int[] values = {10, 5, 15, 2, 7, 20,30};
        for (int v : values)
            bst.insert(v);

        
        System.out.print("Inorder (Sorted): ");
        bst.inorder();

        System.out.println("Search 5: " + bst.search(5));
        System.out.println("Search 99: " + bst.search(99));
    }
    }
    

