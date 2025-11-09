/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heightandleafcounter;

/**
 *
 * @author Jassen
 */
public class student {

    int id;
    String name;
    student left, right;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
        left = right = null;
    }
}
