package problems.easy;

import java.util.Arrays;

public class LeetCode1_ {
    public static void main(String[] args) {
        String s = "my3 is2 India1 country4";
        String[] words = s.split(" ");
        String[] expectedWords = new String[words.length];
        for (String word : words) {
            int value = Character.getNumericValue(word.charAt(word.length() - 1));
            expectedWords[value - 1] = word.substring(0, word.length() - 1);
        }
//        String join = String.join(" ", expectedWords);
//        System.out.println(join);
    }
}
