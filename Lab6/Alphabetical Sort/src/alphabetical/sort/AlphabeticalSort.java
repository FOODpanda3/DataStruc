/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alphabetical.sort;

import static alphabetical.sort.sub.selectionSortNames;


public class AlphabeticalSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] names = {"James,", "Ann,", "Ulysess,", "Daryl,", "Lex,"};

        System.out.println("Alphabetically Sorted:");
        for (String name : selectionSortNames(names)) {
            System.out.print(name + " ");
        }
    
    }
    
}
