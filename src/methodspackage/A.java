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
public class A {
    
    
    static {
        System.out.println("Static A");
    }

    {//instance//
         System.out.println("Instance A");
        
    }
    public A() {
        System.out.println("Constructor in A");
    }
    
    
    public static void main(String[] args) {
        System.out.println("Main in A");
    }
}
