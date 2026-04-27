import java.util.*;

class L8_STRING_TO_INTEGER_ATOI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) <= 57 && s.charAt(0) >= 48)
                return Integer.parseInt(s);
            return 0;
        }

        int i = 0, sign = 0; // by default positive integer
        int digitFound = 0;
        long num = 0;

        StringBuilder numbers = new StringBuilder("");

        while (i != s.length()) {
            if (digitFound == 0) {
                if (s.charAt(i) == ' ') {
                    i++;
                    continue;
                } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                    if (i != s.length() - 1 && s.charAt(i + 1) >= 48 && s.charAt(i + 1) <= 57) {
                        if (s.charAt(i) == '-')
                            sign = 1;
                        else
                            sign = 0;
                    } else
                        break;
                } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                    digitFound = 1;
                    numbers.append(s.charAt(i));
                } else
                    break;
            } else {
                if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                    numbers.append(s.charAt(i));
                } else
                    break;
            }
            i++;
        }

        if (digitFound == 0)
            return 0;

        i = 0;
        // removing leading zeroes
        while (i != numbers.length() && numbers.charAt(i) == '0')
            i++;

        // after removing all leading zeroes, you reach out of the string
        if (i == numbers.length())
            return 0;

        String s1 = numbers.substring(i, numbers.length());

        if (s1.length() < 10) {
            num = Long.parseLong(s1);
            return (int) ((sign == 1) ? -1 * num : num);
        } else if (s1.length() == 10) {
            num = Long.parseLong(s1);
            if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE) {
                return (int) ((sign == 1) ? -1 * num : num);
            } else {
                return (sign == 1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        } else
            return (sign == 1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }
}