/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ReadAndPrint {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int p = s.nextInt();
        int add = d + p;
        System.out.println(add);
    }

}
