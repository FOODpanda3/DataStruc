/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customerqueuemanagement1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Jassen
 */
public class CustomerQueueManagement1 {


    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        Queue<String> customerQueue = new LinkedList<>();
        String choice;

        do {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Show Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter customer name: ");
                    String customer = sc.nextLine();
                    customerQueue.add(customer);
                    System.out.println(customer + " added to the queue.");
                    break;

                case "2":
                    if (!customerQueue.isEmpty()) {
                        String served = customerQueue.poll();
                        System.out.println(served + " has been served.");
                    } else {
                        System.out.println("No customers to serve.");
                    }
                    break;

                case "3":
                    System.out.println("Current Queue: " + customerQueue);
                    break;

                case "0":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (!choice.equals("0"));
        sc.close();
    }
    }
    

