import java.util.Scanner;

class L7_REVERSE_INTEGER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE)
            return 0;

        long rev = 0;

        // x = 123 => rev = rev*10 + 123%10
        // x = 12 => rev = rev*10 + 12%10
        // x = 1 => rev = rev*10 + 1%10
        // x = 0
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        return (int) rev;
    }
}