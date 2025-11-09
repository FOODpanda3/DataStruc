/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expressiontree;

import java.util.Stack;

/**
 *
 * @author Jassen
 */
public class expression {
     
     public static node buildTree(String postfix) {
        Stack<node> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                node right = stack.pop();
                node left = stack.pop();
                node newNode = new node(token);
                newNode.left = left;
                newNode.right = right;
                stack.push(newNode);
            } else {
                stack.push(new node(token));
            }
        }
        return stack.peek();
    }


    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/");
    }


    public static void inorder(node root) {
        if (root != null) {
            if (isOperator(root.value)) System.out.print("(");
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
            if (isOperator(root.value)) System.out.print(")");
        }
    }


    public static double evaluate(node root) {
        if (root == null)
            return 0;

        if (!isOperator(root.value))
            return Double.parseDouble(root.value);

        double leftVal = evaluate(root.left);
        double rightVal = evaluate(root.right);

        switch (root.value) {
            case "+" -> {
                return leftVal + rightVal;
             }
            case "-" -> {
                return leftVal - rightVal;
             }
            case "*" -> {
                return leftVal * rightVal;
             }
            case "/" -> {
                return leftVal / rightVal;
             }
        }
        return 0;}
}
