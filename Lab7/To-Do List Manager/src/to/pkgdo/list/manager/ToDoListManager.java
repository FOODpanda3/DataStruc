/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package to.pkgdo.list.manager;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Jassen
 */
public class ToDoListManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Finish assignment", 1));
        tasks.add(new Task("Clean room", 3));
        tasks.add(new Task("Buy groceries", 2));

        tasks.get(1).priority = 2;

        tasks.sort(Comparator.comparingInt(t -> t.priority));

        tasks.sort(Comparator.comparing(t -> t.description));

        System.out.println("Task List:");
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

}
