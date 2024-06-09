package problems.easy;

import java.util.HashMap;

// Time Complexity is 2^n
// Space Complexity is o(n)
public class ClimbingStair_LeetCode70 {
    public int climbStairs(int n) {
        return totalWays(0, n, new HashMap<>());
    }

    private int totalWays(int currentStair, int targetStair, HashMap<Integer, Integer> map) {
        if (currentStair == targetStair)
            return 1;
        if (currentStair > targetStair)
            return 0;
        int currentKey = currentStair;
        if (map.containsKey(currentKey))
            return map.get(currentKey);
        int oneJump = totalWays(currentStair + 1, targetStair, map);
        int twoJump = totalWays(currentStair + 2, targetStair, map);
        map.put(currentKey, (oneJump + twoJump));
        return twoJump + oneJump;

    }
}
