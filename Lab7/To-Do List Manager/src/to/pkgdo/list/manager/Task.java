/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to.pkgdo.list.manager;

/**
 *
 * @author Jassen
 */
public class Task {

    String description;
    int priority;

    Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String toString() {
        return description + " (Priority: " + priority + ")";
    }
}
