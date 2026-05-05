import java.util.Scanner;

class L13_ROMAN_TO_INTEGER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int i = 0, num = 0;
        while (i != s.length()) {
            if (i + 1 != s.length() &&
                    charToNum(s.charAt(i)) < charToNum(s.charAt(i + 1)))
                num = num - charToNum(s.charAt(i));
            else
                num = num + charToNum(s.charAt(i));
            i++;
        }
        return num;
    }

    public static int charToNum(char a) {
        return switch (a) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
