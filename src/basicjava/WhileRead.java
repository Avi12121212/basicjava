/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WhileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Java");
//        int n = System.in.read();
        int sum = 0;

        Scanner s = new Scanner(new FileInputStream("number.txt"));
        while (s.hasNext()) {
            int n = s.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }

}
