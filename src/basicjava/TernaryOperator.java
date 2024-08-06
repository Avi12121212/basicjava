/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author HP
 */
public class TernaryOperator {

    public static void main(String[] args) {
        int max;
        int a = 3, b = 5, c = 9;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println(max);

        max = (a >= b) ? a : b;
        System.out.println(max);
        System.out.println((a >= b) ? a : b);
        System.out.println(max = (a >= b) ? a : b);

        max = (a >= b) ? (a >= c) ? a : c : (b >= c) ? b : c;
        System.out.println(max);
    }
}
