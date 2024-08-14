/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava2;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class MatrixMultiplication {

    public static void main(String[] args) {
        int a[][] = {{1, 2}, {2, 1}};
        int b[][] = {{2, 1}, {1, 2}};
        int m = a.length, n = a[0].length, r = b.length;
        int[][] result = new int[m][r];
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                for (int k = 0; k <= r - 1; k++) {
                    result[i][k] += a[i][j] * b[j][k];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));

    }

}
