/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expressiontree;

import static expressiontree.expression.buildTree;
import static expressiontree.expression.evaluate;
import static expressiontree.expression.inorder;

/**
 *
 * @author Jassen
 */
public class ExpressionTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String postfix = "3 4 + 2 * 7 /";
        node root = buildTree(postfix);

        System.out.print("Inorder (Infix Expression): ");
        inorder(root);
        System.out.println();

        double result = evaluate(root);
        System.out.println("Postorder Evaluation Result: " + result);
    }
    }
    

