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
public class BestPrimeNumberProgramm {

    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i <= 70; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//                if (count == 2) {
//                    System.out.println(i);
//                }
//            }
//
//        }

        int n = 100;
        int primecount=1,loopcount=0;
        System.out.println("1)2,");
        outer:
        for (int x = 3; x <= n; x+=2) {
            //int n = 7;
            int limit = (int) Math.sqrt(x);
            for (int j = 2; j <= limit; j++) {
                loopcount++;
                if (x % j == 0) {
//                    System.out.printf("not prime no %d \n", x);
                    continue outer;
                }
                
            }
             primecount++;
            System.out.println(primecount + ") " + x + ",");
           
            
        }
        System.out.printf("number of prime number between given range %d : \n",primecount);
        System.out.printf("inner loop count %d\n",loopcount);
    }
}
