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
public class MultilevelArray {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 5, 6, 4, 9}, {12, 54, 11, 47, 52}};
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.println(a[i][j]);
            }
        }
        for (int x : new int[]{1, 2, 3, 4}) {
            System.out.println(x);
        }

        //System.out.println(a.length)
        for (int[] x : a) {
            for (int y : x) {
                System.out.print(y + ",");
            }
        }
        System.out.println();
    }

}
