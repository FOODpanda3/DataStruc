/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromecheckerusingstackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Jassen
 */
public class PalindromeCheckerUsingStackandQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String input = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is NOT a palindrome.");
        }

        sc.close();
    
    }
    
}
