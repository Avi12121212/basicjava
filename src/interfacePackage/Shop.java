/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

/**
 *
 * @author HP
 */
public class Shop {

    public static void main(String[] args) {
        Product[] products = {new Coke("Coca Cola", 100), new Biscuit("parle-g", "Parle", 20, "shubham")};
        for (Product p : products) {
            if (p instanceof Drinkable) {
                System.out.println(p);
            }
        }
    }

}
