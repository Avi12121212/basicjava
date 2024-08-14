/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondmethodpackage;

class First {

    public First(int n) {
        System.out.println(" int wala call hua ");
    }

    public First() {
        System.out.println(" without int wala call hua ");
    }
}

class Second extends First {

    public Second() {
        super(2);
        System.out.println(" this is second class ");
    }
}

class Third extends Second {

    public Third() {

        super();
        System.out.println("this is third class ");
    }

}

public class OnceagainConstructor {

    public static void main(String[] args) {
        //First f1 = new First();
        //Second f2 = new Second();
        Third f3 = new Third();
    }
}
