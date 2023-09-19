package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfDistinctSubstringInAString {
    public static void main(String[] args) {
        System.out.println(getCountNumberOfDistinctSubstringInAString("abc"));
    }

    public static int getCountNumberOfDistinctSubstringInAString(String s) {
        int release = 0;
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0;
        for (int acquire = 0; acquire < s.length(); acquire++) {
            char currentCharacter = s.charAt(acquire);
            while (release < acquire && map.containsKey(currentCharacter)) {
                char discardCharacter = s.charAt(release);
                map.put(discardCharacter, map.get(discardCharacter) - 1);
                release = release + 1;
                if (map.get(discardCharacter) == 0) {
                    map.remove(discardCharacter);
                }

            }
            map.put(currentCharacter, 1);
            answer = answer + acquire - release + 1;
        }
        return answer;
    }
}