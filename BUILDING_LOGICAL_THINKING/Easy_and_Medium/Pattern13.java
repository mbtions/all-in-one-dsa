package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: Lower Triangle with counting numbers
 * 
 * For n = 5
 * 
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 
 */

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_numbers_triangle(n);
    }

    public static void pattern_numbers_triangle(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
}
