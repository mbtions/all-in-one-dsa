import java.util.*;

class L5_LONGEST_PALINDROMIC_SUBSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // brute force approach
        System.out.println(longestPalindromeBFA(s));
    }

    public static String longestPalindromeBFA(String s) {
        if (s.length() == 0 || s.length() == 1 || isPalindrome(s, 0, s.length() - 1))
            return s;

        int maxlen = 1;
        String s2 = s.substring(0, 1);
        for (int i = 2; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                boolean flag = isPalindrome(s, j, j + i - 1);
                if (flag && i > maxlen) {
                    maxlen = i;
                    s2 = s.substring(j, j + i);
                }
            }
        }
        return s2.toString();
    }

    public static String longestPalindromeOPT(String s) {
        if (s.length() == 0 || s.length() == 1 || isPalindrome(s, 0, s.length() - 1))
            return s;
        String s2 = s.substring(0, 1);
        // ...
        // Code to be written later
        // after proper brainstorming
        // ...
        return s2;
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}