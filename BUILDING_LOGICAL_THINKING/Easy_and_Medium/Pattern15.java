package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * Pattern: Inverted Triangle USing ABC
 * 
 * For n = 5
 * 
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 */

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_inverted_triangle_ABC(n);
    }

    public static void pattern_inverted_triangle_ABC(int n) {
        for (int i = 0; i < n; i++) {
            int c = 65;
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) (c + j));
            }
            System.out.println();
        }
    }
}
