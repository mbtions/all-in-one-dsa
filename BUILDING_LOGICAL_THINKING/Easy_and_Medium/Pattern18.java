package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.*;

/**
 * Pattern: Lower Triangle using E D C
 * 
 * for n = 5
 * 
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 * 
 */

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_EDECDE_lower_triangle(n);
    }

    public static void pattern_EDECDE_lower_triangle(int n) {
        int c;
        for (int i = n; i > 0; i--) {
            c = 64 + n;
            for (int j = i; j <= n; j++) {
                System.out.print((char) (c - (n - j)) + " ");
            }
            System.out.println();
        }
    }
}
