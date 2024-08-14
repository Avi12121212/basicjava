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
public class Pattern {

    public static void main(String[] args) {
        int i, j, k;
        int n = 5, q = 6;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) {
                System.out.print("0");
            }

            System.out.println();

        }

    }
}
