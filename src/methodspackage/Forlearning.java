/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodspackage;

class Base {

    public static void Base(String[] args) {
        System.out.println("hello ab");

    }

    public void f() {
        System.out.println("F1 in Base");
    }
}

class Derive extends Base {

    public static void Derive(String[] args) {
        System.out.println("hello derive  class's method");

    }

    @Override
    public void f() {
        System.out.println("F1 in Derive");
    }
}

public class Forlearning {

    public static void main(String[] args) {
        Base x1 = new Base();
        Base x2 = new Derive();
//        Derive x3 = new Base();
        Derive x4 = new Derive();
        x1.f();
        x2.f();//Shubham Base, avinash derive
        x4.f();
        Object o = new String(); //
        
    }

}
