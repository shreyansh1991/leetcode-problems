package problems.easy;

import java.util.Arrays;

public class ReverseStringWithOutImpactingSpecialCharacters {
    public static void main(String[] args) {
        String s = "abcd!!!@$%abcd"; // dcba!!!@$%dcba
        int start = 0;
        int end = s.length() - 1;
        char[] charArray = s.toCharArray();

        while (start < end) {
            if (!Character.isAlphabetic(s.charAt(start))) {
                start++;
            }
            if (!Character.isAlphabetic(s.charAt(end))) {
                end--;
            }
            if(Character.isAlphabetic(s.charAt(start)) && Character.isAlphabetic(s.charAt(end))) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(charArray));
    }
}
