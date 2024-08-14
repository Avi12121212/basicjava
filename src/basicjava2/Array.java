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
public class Array {

    public static void main(String[] args) {
//        int a[] = new int[]{1,2,4,5,6,7};
//        int[] b = {1, 2, 3, 4, 5, 6};
//        int[] c = new int[]{1, 2, 3};
//        int[] d;
//        int[][] e;
//        int[] f[];
//        int g[][]={{1,2,3},{4,5,6}};
//        d = new int[]{9};
//        a[2] = 100;
//        for (int i = 0; i <= a.length - 1; i++) {
//            System.out.print(a[i] + ",");
//        }
//        System.out.println();
//        for (int x : a) {
//            System.out.print(x + ",");
//        }
////        System.out.println();
//        int a[][] = {{1, 2, 32, 5}, {25, 45, 15}};
//        System.out.println(a[1][2]);
//        double b[] = {1, 2, 3};
//        char ad[] = {'a', 'j'};
//        System.out.println(b[1]);

//        String[] ak = {"a", "k", "j", "hg", "gf"};
//        //for (int i = 0; i <= ak.length; i++) {
//           // System.out.println(ak[2]);}
//        for (String o : ak) {
//            System.out.println(o);
//    }
        int a[] = {15, 54, 12, 36, 45, 98, 78, 65, 5};
        int sum = 0;

        for (int i : a) {
            sum += i;

        }
        System.out.println(sum);
    }
}
