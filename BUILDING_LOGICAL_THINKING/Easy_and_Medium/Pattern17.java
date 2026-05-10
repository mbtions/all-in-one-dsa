package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_triangle_ABC(n);
    }

    public static void pattern_triangle_ABC(int n) {
        for (int i = 0; i < n; i++) {
            int c = 65;
            int j = 1;
            // spaces
            for (; j < n - i; j++) {
                System.out.print(" ");
            }

            // first half triangle
            for (; j <= n; j++) {
                System.out.print((char) (c++));
            }
            c--; // 1 step back to stay at the last printed character

            // Second half triangle
            for (; j <= n + i; j++) {
                System.out.print((char) (--c));
            }
            System.out.println();
        }
    }
}
