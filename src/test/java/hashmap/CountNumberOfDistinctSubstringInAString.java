package hashmap;

import java.util.HashMap;

public class CountNumberOfDistinctSubstringInAString {
    public static void main(String[] args) {
        String s = "abc";
        int answer = 0;
        int release = 0;
        HashMap<Character, Integer> memo = new HashMap<>();
        for (int acquire = 0; acquire < s.length(); acquire++) {
            while (release < acquire && memo.containsKey(s.charAt(acquire))) {
                release = release + 1;
                memo.remove(s.charAt(acquire));
            }
            memo.put(s.charAt(acquire), 1);
            answer = answer + acquire - release + 1;
        }
        System.out.println(answer);
    }
}
