import java.util.*;

class L14_LONGEST_COMMON_PREFIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] strs = new String[size];
        for (int i = 0; i < size; i++) {
            strs[i] = sc.next();
        }
        sc.close();

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < strs[0].length(); j++) {
            int match = 0;
            char c = strs[0].charAt(j); // character by character
            // loop for strings
            for (int i = 0; i < strs.length; i++) {
                if (j < strs[i].length() && strs[i].charAt(j) == c) {
                    match++;
                } else {
                    return s.toString();
                }
            }
            if (match == strs.length) // matched will all strings
                s.append(c);
            else
                return s.toString();
        }
        return s.toString();
    }
}
