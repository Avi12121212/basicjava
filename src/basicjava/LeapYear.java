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
 *
 *
 * 0-40 Fail 40-50 3rd 50-60 2nd 60+ 1st
 *
 */
public class LeapYear {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int year = input.nextInt();
//        switch (year % 400) {
//            case 0:
//                System.out.println("Leap Year");
//                break;
//            default:
//                switch (year % 4) {
//                    default:
//                        System.out.println("not a leap year");
//                        break;
//                    case 0:
//                        switch (year % 100) {
//                            case 0:
//                                System.out.println(" notleap year");
//                                break;
//                            default:
//                                System.out.println("leap year");
//                                break;
//                        }
//
//                        break;
//
//                }
//                break;
//
//        }
        System.out.printf("enter the year :");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int r = year%400==0 || year%4==0 && year%100!=0? 1:0;
        switch(r){
            case 1:
                System.out.println(" the leap yr");
                break;
            case 0:
                System.out.println(" not leap yr");
                break;
            default:
                System.out.println(" not leap yr");
        }
    }
}
