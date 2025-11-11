/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package undoredosimulation;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author VILLACORTA_CpE
 */
public class UndoRedoSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String text = "";
        
        while (true){
         System.out.println("\nCurrent Text:" + text);
         System.out.println("1.Type of text");
         System.out.println("2.Undo");
         System.out.println("3.Redo");
         System.out.println("4.Exit");
         System.out.println("Choose:");
         int choose = sc.nextInt();
         sc.nextLine();
         
         switch (choose) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String newText = sc.nextLine();
                    undoStack.push(text); 
                    text += newText;
                    redoStack.clear(); 
                    break;

                case 2:
                    if (!undoStack.isEmpty()) {
                        redoStack.push(text); 
                        text = undoStack.pop(); 
                    } else {
                        System.out.println("Nothing to undo!");
                    }
                    break;

                case 3:
                    if (!redoStack.isEmpty()) {
                        undoStack.push(text);
                        text = redoStack.pop(); 
                    } else {
                        System.out.println("Nothing to redo!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Undo/Redo Simulation...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        
    }
    
}
