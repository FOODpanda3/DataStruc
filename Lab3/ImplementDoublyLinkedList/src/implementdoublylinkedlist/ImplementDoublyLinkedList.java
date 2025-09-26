/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementdoublylinkedlist;


public class ImplementDoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtTail(25);

        list.traverseForward();   
        list.traverseBackward();  

        list.deleteByValue(10);
        list.traverseForward();  
        list.traverseBackward();  

        list.deleteByValue(25);
        list.traverseForward();   
        list.traverseBackward();  
    }
    
}
