/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package undoredosimulation;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Jassen
 */
public class UndoRedoSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> actions = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        String choice;

        do {
            System.out.println("\n1. Perform Action");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Show Actions");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter action: ");
                    String action = sc.nextLine();
                    actions.push(action);
                    redoStack.clear(); 
                    System.out.println("Action added.");
                    break;

                case "2":
                    if (!actions.isEmpty()) {
                        String undone = actions.pop();
                        redoStack.push(undone);
                        System.out.println("Undone: " + undone);
                    } else {
                        System.out.println("No undo.");
                    }
                    break;

                case "3":
                    if (!redoStack.isEmpty()) {
                        String redone = redoStack.pop();
                        actions.push(redone);
                        System.out.println("Redone: " + redone);
                    } else {
                        System.out.println("No redo.");
                    }
                    break;

                case "4":
                    System.out.println("Current: " + actions);
                    break;

                case "0":
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("error");
            }

        } while (!choice.equals("0"));
        sc.close();
    }
    }
    

