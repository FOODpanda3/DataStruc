/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;


public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("=== INSERT ELEMENTS ===");
        
        list.insertAtHead(10);
        list.insertAtHead(5);

        
        list.insertAtTail(20);
        list.insertAtTail(25);

        
        list.traverseForward();   
        list.traverseBackward();  

        System.out.println("\n=== DELETE SPECIFIC VALUE (10) ===");
        
        list.deleteByValue(10);

        
        list.traverseForward();   
        list.traverseBackward();  

        System.out.println("\n=== DELETE TAIL VALUE (25) ===");
        list.deleteByValue(25);
        list.traverseForward();   
        list.traverseBackward();  
    }
    
}
