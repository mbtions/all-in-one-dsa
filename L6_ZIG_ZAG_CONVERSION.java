import java.util.Scanner;

public class L6_ZIG_ZAG_CONVERSION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numRows = sc.nextInt();
        sc.close();

        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if (numRows >= s.length() || numRows == 1)
            return s;

        int jump = 2 * numRows - 2; // jump is the index to jump from one pillar to another
        StringBuilder s2 = new StringBuilder(); // result string

        for (int i = 0; i < numRows; i++) {
            int pillar = i; // pillar is referred to the index for the vertical line

            while (pillar < s.length()) {
                // vertical character
                if (pillar < s.length())
                    s2.append(s.charAt(pillar));
                // diagonal character
                if (i != 0 && i != numRows - 1) // as the last and first row does not have diagonal
                {
                    int diagonal = pillar + (jump - 2 * i); // diagonal index
                    if (diagonal < s.length())
                        s2.append(s.charAt(diagonal));
                }
                pillar += jump;
            }
        }
        return s2.toString();
    }
}
