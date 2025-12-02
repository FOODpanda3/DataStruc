/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortstudentgrades;

import static sortstudentgrades.sub.bubbleSort;
import static sortstudentgrades.sub.insertionSort;
import static sortstudentgrades.sub.selectionSort;


public class SortStudentGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] grades = {88, 73, 92, 85, 67, 90};

        System.out.println("Bubble Sort:");
        printArray(bubbleSort(grades));

        System.out.println("Selection Sort:");
        printArray(selectionSort(grades));

        System.out.println("Insertion Sort:");
        printArray(insertionSort(grades));
    }

   
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
    }
    

