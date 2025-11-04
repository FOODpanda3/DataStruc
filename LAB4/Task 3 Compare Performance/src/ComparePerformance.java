/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VILLACORTA_CpE
 */
public class ComparePerformance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr ={ 1, 10, 15, 20, 25, 30};
        
        int key = 15;
        int comp = 0;
        boolean Array = false;
        
       for (int i = 0; i < arr.length; i++) {
            comp++;
            if (arr[i] == key) {
               Array = true;
                break;
            }
        }
         System.out.println("Array Search:");
        System.out.println("Value found: " + Array);
        System.out.println("Comparisons: " + comp);
        
         BinarySearchTree bst = new BinarySearchTree();
        for (int value : arr) {
            bst.insert(value);
    }
          boolean foundInBST = bst.search(key);
        System.out.println("\nBST Search:");
        System.out.println("Value found: " + foundInBST);
        System.out.println("Comparisons: " + bst.comp);
        
         System.out.println("\nEfficiency Comparison:");
        System.out.println("Array Comparisons: " + Array);
        System.out.println("BST Comparisons: " + bst.comp);
        System.out.println("\nBST is more efficient for large datasets because it reduces search time from O(n) to O(log n).");


} }
