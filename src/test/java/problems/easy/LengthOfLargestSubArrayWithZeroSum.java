package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLargestSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {-2, 2, -7, 7};
        int prefixSum = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(prefixSum, -1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            if (map.containsKey(prefixSum)) {
                answer = Math.max(answer, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        System.out.println(answer);
    }
}
