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
public class Biscuit extends Product{
    String company;
    int price;
    String owner;

    public Biscuit(String name, String company, int price, String owner) {
        super(name,price);
        
        this.company = company;
        this.price = price;
        this.owner = owner;
    }
    
    public static void main(String[] args) {
        
    }

 
}
