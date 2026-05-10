package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: O Shaped Star Pattern.
 * 
 * for n = 4
 * 
 * ****
 * *__*
 * *__*
 * ****
 * 
 * for n = 5
 * 
 * *****
 * *___*
 * *___*
 * *___*
 * *****
 * 
 */

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_O_shape(n);
    }

    public static void pattern_O_shape(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
