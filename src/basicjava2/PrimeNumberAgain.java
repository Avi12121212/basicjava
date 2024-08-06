/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava2;

/**
 *
 * @author HP
 */
public class PrimeNumberAgain {

    public static void main(String[] args) {

        int n = 70, p = 5;
        int t = 2;
        while (p <= n) {
//            System.out.println(t);

            p = p + t;
            t = 6 - t;
            System.out.print(p + " ");
            p = p + 4;
            System.out.print(p + " ");

        }
//
    }

}
