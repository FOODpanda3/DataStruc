/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product.inventory;

import java.util.ArrayList;
import java.util.Comparator;


public class ProductInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 50000, 3));
        products.add(new Product("Mouse", 500, 10));
        products.add(new Product("Keyboard", 1500, 5));

        products.removeIf(p -> p.name.equals("Mouse"));

        double totalInventory = 0;
        for (Product p : products) {
            totalInventory += p.totalValue();
        }
        System.out.println("Total Inventory Value: " + totalInventory);

        products.sort(Comparator.comparingDouble(p -> p.price));

        System.out.println("Product List:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
