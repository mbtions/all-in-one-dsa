package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.*;

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
