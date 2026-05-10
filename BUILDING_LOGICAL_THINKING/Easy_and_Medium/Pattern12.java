package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: for n = 5
 * 
 * 1________1
 * 12______21
 * 123____321
 * 1234__4321
 * 1234554321
 */

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_M_shaped_triangles(n);
    }

    public static void pattern_M_shaped_triangles(int n) {
        for (int i = 1; i <= n; i++) {
            int j = 1;
            // forward
            for (; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (; j <= 2 * (n - i) + i; j++) {
                System.out.print(" ");
            }
            // reverse
            for (; j <= n * 2; j++) {
                System.out.print(2 * n - j + 1);
            }
            System.out.println();
        }
    }
}
