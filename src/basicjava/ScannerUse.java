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
public class ScannerUse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstname, secondname;
        String fullname;
        firstname = s.next();
        secondname = s.next();
        System.out.println("Fname " + firstname + ", second name" + secondname);
        s.nextLine();
        fullname = s.nextLine();
        System.out.println(fullname);

    }
}
