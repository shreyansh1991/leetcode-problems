package problems.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShuffleTheArray {
        public static void main(String[] args) {
            String s = "abcabcbb";
            int start = 0;
            int end = 0;
            Set<Character> set = new HashSet<>();
            int longestSubStringLength = 0;
            while (end < s.length()) {
                if (!set.contains(s.charAt(end))) {
                    set.add(s.charAt(end));
                    end++;
                    longestSubStringLength = Math.max(longestSubStringLength, set.size());
                } else {
                    set.remove(s.charAt(start));
                    start++;
                }
            }
            System.out.println(longestSubStringLength);
    }
}
