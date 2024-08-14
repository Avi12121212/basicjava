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
public class Beer implements Drinkable{
    String company,owner;
    double alcohal;

    public Beer(String company, String owner, int cost, double alcohal) {
        this.company = company;
        this.owner = owner;
        this.alcohal = alcohal;
    }

    @Override
    public String type() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "this is drinkable";
    }
    public static void main(String[] args) {
        
    }
}