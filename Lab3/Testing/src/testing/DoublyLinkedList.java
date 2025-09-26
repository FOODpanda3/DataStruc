/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

/**
 *
 * @author Jassen
 */
public class DoublyLinkedList {
       private Node head;  
    private Node tail;   

   
    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

 
    public void insertAtTail(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

   
    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }
        if (current == null) {
            return; 
        }
       
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; 
            }
            return;
        }

       
        
        if (current == tail) {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            return;
        }

        
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

 
    public void traverseForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

   
    public void traverseBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
