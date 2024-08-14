/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodspackage;

/**
 *
 * @author HP
 */
public class BankAccount {

    static int rateofinterest;
    static String bankname;
    int accno, balance;
    String customername;
    String fathername;

    static {//Static block
        System.out.println("Static 1");
        rateofinterest = 10;
        bankname = "pnb";
    }

    {//Instance Block
        System.out.println("Block 1");
    }

    public BankAccount(int accno, int balance, String customername,String fathername) {
        System.out.println("Constructor");
        this.accno = accno;
        this.balance = balance;
        this.customername = customername;
        this.fathername=fathername;
    }

    public static void main(String[] args) {
        System.out.println("rateofinterest");
        new BankAccount(10, 100, "rohit","jai");
        new BankAccount(10, 100, "rohit","viru");
        new BankAccount(10, 100, "rohit","prince");
    }
}
