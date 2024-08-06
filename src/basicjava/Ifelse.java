/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.*;

/**
 *
 * @author HP
 */
public class Ifelse {

    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = 5;
//        if (a > b) {
//            System.out.printf("a=%s is greater number\n ", a);
//        } else {
//            System.out.printf("b=%d is greater ", b);
//        }
//        double q = Math.pow(5, 2);
//        System.out.printf("q:%f \n", q);

//        double z = Math.sin(90);
//        System.out.printf("z:%f \n", z);
//        System.out.println(Math.floor(11.5));
//        System.out.println(Math.ceil(11.5));
//        System.out.println(Math.signum(10));
//        System.out.println(Math.signum(-10));
//        System.out.println(Math.signum(0));
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        if (a == b) {
//            System.out.printf("this number are eqaul");
//        } else {
//            if (a > b) {
//                System.out.println("a is bigger");
//            } else {
//                System.out.println("b is bigger");
//            }
//            //System.out.printf("this is odd number ");
        //}

        String button = (String)(input.next());
        if (button.equals("b")) {
            System.out.println("hello");
        } else if (button.equals("a")) {
            System.out.println("namste");
        } else if (button.equals("c")) {
            System.out.println("bhaloo");
        }
    }

}
