package basicjava;

import java.util.*;

public class ContinueOuterLoop {

    public static void main(String[] args) {
        int i, j;
        int n = 5;
        Scanner input = new Scanner(System.in);
        outer:
        for (i = 0; i <= 5; i++) {
            inner:
            for (j = 0; j <= i; j++) {
                System.out.println("*");
                System.out.println("which loop you want to leave");
                int a = input.nextInt();
                if (a == 1) {
                    break inner;
                }
                if (a == 2) {
                    break outer;
                }
            }
            System.out.println("");
        }
    }
}
