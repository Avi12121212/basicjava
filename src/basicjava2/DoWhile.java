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
public class DoWhile {

    public static void main(String[] args) {
        int a = 0, sum = 0;
        do {
            sum += a;
            System.out.print(a + " ");
            System.out.println(sum);
            a++;
        } while (a < 10);
    }

}
