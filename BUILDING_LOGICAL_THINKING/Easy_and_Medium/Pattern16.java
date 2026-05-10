package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: Lower Triangle using ABC
 * 
 * for n = 5
 * 
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * 
 */

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_ABBCCC_triangle(n);
    }

    public static void pattern_ABBCCC_triangle(int n) {
        for (int i = 0; i < n; i++) {
            int c = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (i + c));
            }
            System.out.println();
        }
    }
}
