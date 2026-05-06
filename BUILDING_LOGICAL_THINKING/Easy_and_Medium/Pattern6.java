package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.*;

/**
 * This is a class to print the pattern of the following type
 * Input: n
 * Numbers(1 to n) are to be printed in a matrix of order n x n
 * in the followind output format.
 * 
 * Expected Output: for n = 5 (say)
 * 
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 
 * There are n rows and n columns in the output,
 * where the numbers in a row keep decreasing with the decreasing row.
 * i.e. (an inverted lower triangular pattern) or you can say that
 * 
 * numbers in a row = row number
 * 
 * Assume that the row is in reverse order i.e.,
 * 
 * 5th row -> 12345
 * 4th row -> 1234
 * 3rd row -> 123
 * 2nd row -> 12
 * 1st row -> 1
 * 
 */

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_inverted_lower_triangular123451234(n);
    }

    static void pattern_inverted_lower_triangular123451234(int n) {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
