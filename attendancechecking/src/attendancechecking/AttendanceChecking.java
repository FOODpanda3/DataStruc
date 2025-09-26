package attendancechecking;

import java.util.Scanner;

public class AttendanceChecking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] students = {
            "karl", "Daryl", "lex", "yuls", "rogyxx"
        };

        System.out.print("Enter student name to check attendance: ");
        String targetName = sc.nextLine();

        int result = linearSearch(students, targetName);

        if (result == -1) {
            System.out.println("Student \"" + targetName + "\" is ABSENT.");
        } else {
            System.out.println("Student \"" + targetName + "\" is PRESENT (found at roll #" + result + ").");
        }

        sc.close();
    }

   
    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(target)) { 
                return i;
            }
        }
        return -1; 
    }
}
