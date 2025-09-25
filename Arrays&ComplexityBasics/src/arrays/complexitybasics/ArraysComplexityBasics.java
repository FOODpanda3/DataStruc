package arrays.complexitybasics;

import java.util.Arrays;

public class ArraysComplexityBasics {

    public static void main(String[] args) {
   
        int[] arr = {100, 200, 300, 400, 500};
        System.out.println("Original Array: " + Arrays.toString(arr));


        arr = insertAtPosition(arr, 2, 99); 
        System.out.println("After Insert at Position 2: " + Arrays.toString(arr));

        
        arr = deleteAtPosition(arr, 3);
        System.out.println("After Delete at Position 3: " + Arrays.toString(arr));


        int[] maxMin = findMaxMin(arr);
        System.out.println("Maximum = " + maxMin[0] + ", Minimum = " + maxMin[1]);
    }


    public static int[] insertAtPosition(int[] array, int position, int value) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = value;
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

   
    public static int[] deleteAtPosition(int[] array, int position) {
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        for (int i = position; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }


    public static int[] findMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return new int[]{max, min};
    }
}
