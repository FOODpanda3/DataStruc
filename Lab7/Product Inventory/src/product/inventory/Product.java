/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product.inventory;

/**
 *
 * @author Jassen
 */
public class Product {

    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValue() {
        return price * quantity;
    }

    public String toString() {
        return name + " - $" + price + " - Qty: " + quantity;
    }
}
