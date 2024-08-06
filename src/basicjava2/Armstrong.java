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
public class Armstrong {

    public static void main(String[] args) {
        int n = 153, sum = 0;
        int copy = n;
        while (copy != 0) {
            int r = copy % 10;
            sum = sum + r * r * r;
            copy = copy / 10;

        }
        //System.out.println(sum);
        if (sum == n) {
            System.out.println("Armstrong number");
        }
    }

}
