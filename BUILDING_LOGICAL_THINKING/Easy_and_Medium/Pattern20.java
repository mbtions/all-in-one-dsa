package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.*;

/**
 * Pattern: M-W shaped triangles
 * 
 * for n = 5
 * 
 * *________*
 * **______**
 * ***____***
 * ****__****
 * **********
 * ****__****
 * ***____***
 * **______**
 * *________*
 * 
 * 1 star (n-1)*2 spaces 1 star
 * 2 stars (n-2)*2 spaces 2 stars
 * 3 stars (n-3)*2 spaces 3 stars
 * 4 stars (n-4)*2 spaces 4 stars
 * 5 stars (n-5)*2 spaces 5 stars
 * 4 stars (n-4)*2 spaces 4 stars
 * 3 stars (n-3)*2 spaces 3 stars
 * 2 stars (n-2)*2 spaces 2 stars
 * 1 star (n-1)*2 spaces 1 star
 * 
 * 
 */

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_MW_triangles(n);
    }

    public static void pattern_MW_triangles(int n) {
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
