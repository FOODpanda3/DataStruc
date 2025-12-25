/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratingthroughhashmap;

import java.util.HashMap;

public class IteratingThroughHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> library = new HashMap<>();

        library.put("Java Programming", 3);
        library.put("Data Structures", 5);
        library.put("Operating Systems", 2);

        System.out.println("Initial Library:");
        displayLibrary(library);

        library.remove("Operating Systems");
        System.out.println("\nAfter Removing a Book:");
        displayLibrary(library);

        String borrowBook = "Java Programming";
        if (library.containsKey(borrowBook) && library.get(borrowBook) > 0) {
            library.put(borrowBook, library.get(borrowBook) - 1);
            System.out.println("\nBorrowed: " + borrowBook);
        }

        library.put(borrowBook, library.get(borrowBook) + 1);
        System.out.println("\nReturned: " + borrowBook);

        System.out.println("\nFinal Library Status:");
        displayLibrary(library);
    }

    static void displayLibrary(HashMap<String, Integer> library) {
        for (String title : library.keySet()) {
            System.out.println(title + " - Copies Available: " + library.get(title));
        }
    }

}
