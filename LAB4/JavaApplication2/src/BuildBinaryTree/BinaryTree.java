/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildBinaryTree;

/**
 *
 * @author VILLACORTA_CPE
 */
public class BinaryTree {
    TreeNode root;

    public BinaryTree(int rootData) {
        root = new TreeNode(rootData);
    }

   
    public TreeNode insertManual(TreeNode parent, int childData, boolean isLeft) {
        TreeNode newNode = new TreeNode(childData);
        if (isLeft) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        return newNode;
    }

  
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

 
    public void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    
    public void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
