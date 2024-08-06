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
public class SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a) {
            case 1:
                System.out.println("india");
                break;
            case 2:
                System.out.println("pak");
                break;
            default:
                System.out.println("indavid number ");
        }

    }

}
