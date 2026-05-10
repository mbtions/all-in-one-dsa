package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_traingle_inverted(n);
    }

    public static void pattern_traingle_inverted(int n) {
        for (int i = 1; i <= n; i++) {
            int j = 1;
            // spaces
            for (; j < i; j++) {
                System.out.print(" ");
            }

            // inverted triangle
            for (; j <= n + (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
