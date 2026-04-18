import java.util.*;

class L3_LONGEST_SUBSTRING_WIIHTOUT_REPEATING_CHARACTERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        // Brute Force Approach
        System.out.println(lengthOfLongestSubstringBFA(s));

        // Optimized Approach
        System.out.println(lengthOfLongestSubstringOPT(s));

        sc.close();
    }

    public static int lengthOfLongestSubstringBFA(String s) {
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

    public static int lengthOfLongestSubstringOPT(String s) {
        int l = 0, mx = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            if (!hmap.containsKey(s.charAt(r))) {
                hmap.put(s.charAt(r), r);
            } else {
                if (hmap.get(s.charAt(r)) >= l) {
                    l = hmap.get(s.charAt(r)) + 1;
                }
                hmap.put(s.charAt(r), r);
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }
}