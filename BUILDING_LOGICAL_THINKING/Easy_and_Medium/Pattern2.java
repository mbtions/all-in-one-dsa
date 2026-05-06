package BUILDING_LOGICAL_THINKING.Easy_and_Medium;

import java.util.*;

/**
 * This is a class to print the pattern of the following type
 * Input: n
 * Stars(or asterisk '*') are to be printed in a matrix of order n x n
 * in the followind output format.
 * 
 * Expected Output: for n = 5 (say)
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * There are n rows and n columns in the output,
 * where the stars keep increasing with the increasing row.
 * i.e. (a lower triangular pattern) or you can say that
 * 
 * number of stars in a row = row number
 * 
 * 1st row -> 1 star
 * 2nd row -> 2 stars
 * 3rd row -> 3 stars
 * 4th row -> 4 stars
 * 5th row -> 5 stars
 * 
 */

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pattern_lower_triangular(n);
    }

    static void pattern_lower_triangular(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
