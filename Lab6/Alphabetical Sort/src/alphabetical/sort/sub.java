/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphabetical.sort;

/**
 *
 * @author Jassen
 */
public class sub {
     public static String[] selectionSortNames(String[] arr) {
        String[] a = arr.clone();
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j].compareToIgnoreCase(a[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        return a;}
}
