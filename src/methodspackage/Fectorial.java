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
class Fectorial {

    public static int fecto(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(fecto(5));
        System.out.println(sum(4, 6));
    }
}
