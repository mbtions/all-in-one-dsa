package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: Lower Triangle Using ABC
 * 
 * For n = 5
 * 
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * 
 */

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_AABABC_triangle(n);
    }

    public static void pattern_AABABC_triangle(int n) {
        for (int i = 0; i < n; i++) {
            int c = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (c + j));
            }
            System.out.println();
        }
    }
}
