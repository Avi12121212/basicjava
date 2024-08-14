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
public class NewPattern {

    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == 2 || j == 3) {
                    System.out.println("* ");
                }
                System.out.print("O ");
            }
            System.out.println("");

        }
    }
}
