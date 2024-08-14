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
        int n = 100;
        int count = 3;
        int t = 2;
        System.out.println("1)2\n2)3\n3)5\n");
        int i = 5;
        outer:
        while (true) {
//            System.out.println(i);

            i += t;
            if (i > n) {
                break;
            }
            t = 6 - t;
            int limit = (int) Math.sqrt(i);
            int j = 2;
            while (j <= limit) {
                if (i % j == 0) {
                    continue outer;
                }
                j++;
            }
            count++;
           // System.out.printf("%s)%s\n", count, i);

        }

    }

}
