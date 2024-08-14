/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;
import newpackage1.*;

/**
 *
 * @author HP
 */
public class B extends A {
    public  String a = "B wala";
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        System.out.println(b.a);
        
        System.out.println(a.a);
        
    }
    
}
