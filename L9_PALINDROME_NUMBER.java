import java.util.Scanner;

public class L9_PALINDROME_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int orig = x, rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev == orig)
            return true;

        return false;
    }
}
