package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: Diamond Complement
 * 
 * for n = 5
 * 
 * **********
 * ****__****
 * ***____***
 * **______**
 * *________*
 * **______**
 * ***____***
 * ****__****
 * **********
 * 
 * n stars 0 space 0 space n stars
 * n-1 stars 1 space 1 space n-1 stars
 * n-2 stars 2 space 2 space n-2 stars
 * n-3 stars 3 space 3 space n-3 stars
 * n-4 stars 4 space 4 space n-4 stars
 * n-3 stars 3 space 3 space n-3 stars
 * n-2 stars 2 space 2 space n-2 stars
 * n-1 stars 2 space 2 space n-1 stars
 * n stars 0 space 0 space n stars
 * 
 * Above can be simplified as:
 * 
 * n-0 stars 2*0 spaces n-0 stars
 * n-1 stars 2*1 spaces n-1 stars
 * n-2 stars 2*2 spaces n-2 stars
 * n-3 stars 2*3 spaces n-3 stars
 * n-4 stars 2*4 spaces n-4 stars
 * n-3 stars 2*3 spaces n-3 stars
 * n-2 stars 2*2 spaces n-2 stars
 * n-1 stars 2*1 spaces n-1 stars
 * n-0 stars 2*0 spaces n-0 stars
 * 
 */

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_diamond_complement(n);
    }

    public static void pattern_diamond_complement(int n) {
        // upper half
        for (int i = 0; i <= 4; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = 3; i >= 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
