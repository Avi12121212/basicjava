/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodspackage;

/**
 *
 * @author HP
 */
public class StaticAndInstance {

    void instanceFunction() {
        System.out.println("instance function");
    }

    public static void myName() {
        System.out.println("avinash");
    }

    public static void main(String[] args) {
        myName();
        StaticAndInstance.myName();
        StaticAndInstance sai = new StaticAndInstance();// this is not static becoz of this we have made the object 
        sai.instanceFunction(); //of the function 

    }
}
