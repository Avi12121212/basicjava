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
public class Coke extends Product implements Drinkable{
    String companyname;
    String country,owner;

    public Coke(String productname, double cost) {
        super(productname, cost);
    }

    @Override
    public String toString() {
        return "Coke{" + "companyname=" + companyname + ", country=" + country + ", owner=" + owner + '}';
    }

    @Override
    public String type() {
return "Coke";
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
