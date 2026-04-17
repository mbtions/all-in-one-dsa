import java.util.HashSet;
import java.util.Scanner;

class L3_LONGEST_SUBSTRING_WIIHTOUT_REPEATING_CHARACTERS_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(lengthOfLongestSubstring(s));

        sc.close();
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            HashSet<Character> hs = new HashSet<>();
            hs.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (hs.contains(s.charAt(j))) {
                    break;
                }
                count++;
                hs.add(s.charAt(j));
            }
            max = (max < count) ? count : max;
        }
        return max;
    }
}