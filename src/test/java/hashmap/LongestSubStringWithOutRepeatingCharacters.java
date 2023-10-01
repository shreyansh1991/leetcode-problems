package hashmap;

import java.util.HashMap;

public class LongestSubStringWithOutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbda";
        HashMap<Character, Integer> map = new HashMap<>();
        int release = 0;
        int answer = 0;
        for (int acquire = 0; acquire < s.length(); acquire++) {
            if (map.containsKey(s.charAt(acquire)) && map.get(s.charAt(acquire)) >= release) {
                release = map.get(s.charAt(acquire)) + 1;
            }
            map.put(s.charAt(acquire), acquire);
            answer = Math.max(answer, (acquire - release + 1));

        }
        System.out.println(answer);
    }
}
