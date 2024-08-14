/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondmethodpackage;

class Base {

    public Base(int n) {
        System.out.println("1 param constructor Base");
    }

    public Base() {

        System.out.println("0 param constructor Base");
    }

    public static void A() {
        System.out.println("this is base class");

    }
}

class Derived extends Base {

    Derived() {

        super(2); // super keywork use to call constructor of super call
        System.out.println("0 param constructor in Derived ");
    }

    public static void B() {
        System.out.println("this is second class ");
    }
}

public class ConstructorCalling {

    public static void main(String[] args) {
        Base b1 = new Base();
//        Base b2 = new Derived();
        Derived d1 = new Derived();

    }
}
