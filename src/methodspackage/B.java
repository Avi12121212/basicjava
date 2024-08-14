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
public class B extends A {

    static {
        System.out.println("Static B");
    }

    {
        System.out.println("Instance B");

    }

    public B() {
        System.out.println("Constructor in B");
    }

    public static void main(String[] args) {
        System.out.println("Main in B");
//        new A();
        new B();
    }

}
