package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.Scanner;

/**
 * This is a class to print the pattern of the following type
 * Input: n
 * n x n stars are to be printed in a matrix of order n x n.
 * 
 * Expected Output: for n = 5 (say)
 * 
 * *****
 * *****
 * *****
 * *****
 * *****
 * 
 * There are n rows and n columns in the output.
 */

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_nxn(n);
    }

    static void pattern_nxn(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
