package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.*;

/**
 * To print a star triangle pattern in the following way:
 * 
 * Input: n = 5
 * Ouptut:
 * 
 * ____*
 * ___***
 * __*****
 * _*******
 * *********
 * 
 * underscore represents space.
 * 
 * n-1 spaces (1+0 or 2*1-1) stars
 * n-2 spaces (2+1 or 2*2-1) stars
 * n-3 spaces (3+2 or 2*3-1) stars
 * n-4 spaces (4+3 or 2*4-1) stars
 * n-5 spaces (5+4 or 2*5-1) stars
 */

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_triangle(n);
    }

    public static void pattern_triangle(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            int j = 1;
            for (; j < n - i; j++) {
                System.out.print(" ");
            }

            // triangle
            for (; j <= n + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
