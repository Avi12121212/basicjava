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
public class LableLoop {

    public static void main(String[] args) {
        int i, j;
        int n = 3;
        outer:    for (i = 0; i <= n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
                if(j>=2)
                    break ;
                
            }
            System.out.println();
        }
    }

}
