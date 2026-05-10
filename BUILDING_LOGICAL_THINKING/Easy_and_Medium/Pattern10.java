package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: Right half diamond (a type of triangle)
 * 
 * for n = 5
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_righthalf_diamond(n);
    }

    public static void pattern_righthalf_diamond(int n) {
        for (int i = 1; i < n * 2; i++) {
            int j = 1;

            if (i <= n) {
                for (; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (; j <= n - (i - n); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
