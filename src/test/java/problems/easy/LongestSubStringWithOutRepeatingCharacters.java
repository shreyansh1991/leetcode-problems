package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithOutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abcdabcefgas";
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        int longestSubStringLength = 0;
        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                i++;
                 longestSubStringLength = Math.max(longestSubStringLength, set.size());
            } else {
                set.remove(s.charAt(j));
                j++;
                i++;
            }
        }
        System.out.println(longestSubStringLength);
    }
}
