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
 * where the numbers in a row keep increasing with the increasing row,
 * and these row times of the row number.
 * i.e. (a lower triangular pattern) or you can say that
 * 
 * numbers in a row = row number up to row times ( say 4th row then 4444)
 * 
 * 1st row -> 1
 * 2nd row -> 22
 * 3rd row -> 333
 * 4th row -> 4444
 * 5th row -> 55555
 * 
 * .
 * .
 * rth row -> 1234...r
 * 
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_lower_triangular122333(n);
    }

    static void pattern_lower_triangular122333(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
