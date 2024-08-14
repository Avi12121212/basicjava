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
class Parent {

    public static void Parent() {
        System.out.println("parent");
    }

    public void Hello() {
        System.out.println("hello all");
        Parent();
    }

}

class Child extends Parent {

    public static void Child() {
        System.out.println("child");
    }
}

class Inheritance {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Child.Child();
        Child.Parent();
       // Child.Hello();
        c.Hello();
//        Parent.Parent();
//        p.Hello();

        // child();
    }
}
