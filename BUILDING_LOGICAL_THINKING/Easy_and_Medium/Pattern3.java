package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.*;

/**
 * This is a class to print the pattern of the following type
 * Input: n
 * Numbers ( from 1, 2, 3, .... to n) are to be printed in a matrix of order n x
 * n
 * in the following output format.
 * 
 * Expected Output: for n = 5 (say)
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * There are n rows and n columns in the output,
 * where the numbers in a row keep increasing with the increasing row.
 * i.e. (a lower triangular pattern) or you can say that
 * 
 * numbers in a row => 1 up to row number ( say 4th row then up to 4)
 * 
 * 1st row -> 1
 * 2nd row -> 12
 * 3rd row -> 123
 * 4th row -> 1234
 * 5th row -> 12345
 * 
 * .
 * .
 * rth row -> 1234...r
 * 
 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_lower_triangular112123(n);
    }

    static void pattern_lower_triangular112123(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
