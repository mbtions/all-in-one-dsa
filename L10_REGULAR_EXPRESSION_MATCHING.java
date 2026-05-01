import java.util.*;

class L10_REGULAR_EXPRESSION_MATCHING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        sc.close();

        System.out.println(isMatch(s, p));
    }

    // Top Down Memoization
    static HashMap<String, Boolean> hmap = new HashMap<>();

    public static boolean isMatch(String s, String p) {
        hmap.clear();
        return isRecursiveMatch(0, 0, s, p);
    }

    public static boolean isRecursiveMatch(int i, int j, String s, String p) {
        String key = i + "," + j;

        // if it is already checked earlier
        if (hmap.containsKey(key))
            return hmap.get(key);

        // when both string and pattern are over i.e., match done
        if (i >= s.length() && j >= p.length())
            return true;

        // when string remains when pattern is over
        if (j >= p.length())
            return false;

        // when s[i] equals p[j] or p[j] is '.'
        boolean match = (i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        // when '*'' is next in the pattern
        if ((j + 1) < p.length() && p.charAt(j + 1) == '*') {
            hmap.put(key,
                    isRecursiveMatch(i, j + 2, s, p) // s[i] != p[j], don't use '*'
                            ||
                            (match && isRecursiveMatch(i + 1, j, s, p))); // s[i] = p[j], use '*'
            return hmap.get(key);
        }

        if (match) {
            // when s[i] is any single character that exactly matches the pattern
            hmap.put(key, isRecursiveMatch(i + 1, j + 1, s, p));
            // case: a -> a or a -> .
            return hmap.get(key);
        }

        // for any other case, pattern not matched
        hmap.put(key, false);
        return false;
    }
}