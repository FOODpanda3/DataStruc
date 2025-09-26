package studentidlookup;

import java.util.Scanner;

public class StudentIDLookup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentid = {1, 2, 3, 4, 5};

        System.out.print("Enter Student ID to search: ");
        int targetid = sc.nextInt();

        int result = linearSearch(studentid, targetid);

        if (result == -1) {
            System.out.println("Student ID " + targetid + " not found in the records.");
        } else {
            System.out.println("Student ID " + targetid + " found at index " + result);
        }

        sc.close();
    }

    // Linear Search Method (must be outside main)
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }
}