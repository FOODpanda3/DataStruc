/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear.search.applications.in.real.life;

import java.util.Scanner;

/**
 *
 * @author Jassen
 */
public class LinearSearchApplicationsInRealLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30; 

      
        int result = linearSearch(arr, target);

       
        if (result == -1) {
            System.out.println("Element " + target + " not found.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }

    
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }    }


