package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * The Diamond Pattern: for n = 5
 * 
 * ____*
 * ___***
 * __*****
 * _*******
 * *********
 * *********
 * _*******
 * __*****
 * ___***
 * ____*
 */

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_diamond(n);
    }

    public static void pattern_diamond(int n) {

        for (int i = 0; i < n * 2; i++) {
            int j = 1;
            if (i < n) {
                // traingle

                // spaces
                for (; j < n - i; j++) {
                    System.out.print(" ");
                }

                // stars triangle pattern
                for (; j <= n + i; j++) {
                    System.out.print("*");
                }

            } else {
                // inverted triangle

                // spaces
                for (; j < i - n + 1; j++) {
                    System.out.print(" ");
                }

                // stars inverted triangle pattern
                for (; j < n + (n - (i - n)); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
