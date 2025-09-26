package librarybookfinder;

import java.util.Scanner;

public class LibraryBookFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] books = {
            "Introduction to Java",
            "Data Structures and Algorithms",
            "Database Systems",
            "Operating System Concepts",
            "Computer Networks"
        };

        System.out.print("Enter book title to search: ");
        String targetBook = sc.nextLine();

        int result = linearSearch(books, targetBook);

        if (result == -1) {
            System.out.println("Book \"" + targetBook + "\" not found in the library records.");
        } else {
            System.out.println("Book \"" + targetBook + "\" found at shelf index " + result);
        }

        sc.close();
    }

    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(target)) { // ignore case
                return i;
            }
        }
        return -1; // Not found
    }
}
