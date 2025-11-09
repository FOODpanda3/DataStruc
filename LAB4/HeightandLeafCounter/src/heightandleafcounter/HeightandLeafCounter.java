/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heightandleafcounter;

/**
 *
 * @author Jassen
 */
public class HeightandLeafCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studentbts tree = new studentbts();

        tree.insert(102, "daryl");
        tree.insert(105, "yuls");
        tree.insert(101, "rogyx");
        tree.insert(103, "peter");
        tree.insert(107, "lian");

        tree.displayInOrder();

        System.out.println("\nHeight of Tree: " + tree.findHeight());
        System.out.println("Number of Leaf Nodes: " + tree.countLeaves());
    }

}
