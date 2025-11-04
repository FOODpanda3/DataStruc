/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package  BuildBinaryTree;
;


public class BuildBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        BinaryTree bt = new BinaryTree(1);

       
        TreeNode node2 = bt.insertManual(bt.root, 2, true);   
        TreeNode node3 = bt.insertManual(bt.root, 3, false);  
        TreeNode node4 = bt.insertManual(node2, 4, true);     
        TreeNode node5 = bt.insertManual(node2, 5, false);    
        TreeNode node6 = bt.insertManual(node3, 6, true);     
        TreeNode node7 = bt.insertManual(node3, 7, false);    

        System.out.println("Inorder Traversal:");
        bt.inorder(bt.root); 

        System.out.println("\nPreorder Traversal:");
        bt.preorder(bt.root);

        System.out.println("\nPostorder Traversal:");
        bt.postorder(bt.root);
    }
    }
    

