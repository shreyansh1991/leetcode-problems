package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class CountOfDistinctElementsInWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 1, 2, 1, 4, 3, 1};
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> memo = new HashMap<>();
        int n = arr.length;
        int k = 3;
        int distinct = 0;
        for (int i = 0; i < k; i++) {
            if (memo.containsKey(arr[i])) {
                memo.put(arr[i], memo.get(arr[i]) + 1);
            } else {
                memo.put(arr[i], 1);
                distinct = distinct + 1;
            }
        }
        answer.add(distinct);
        int release = 0;
        for (int acquire = k; acquire < n; acquire++) {
            memo.put(arr[release], memo.get(arr[release]) - 1);
            if (memo.get(arr[release]) == 0) {
                memo.remove(arr[release]);
                distinct = distinct - 1;
            }
            release = release + 1;


            if (memo.containsKey(arr[acquire])) {
                memo.put(arr[acquire], memo.get(arr[acquire]) + 1);
            } else {
                memo.put(arr[acquire], 1);
                distinct = distinct + 1;
            }
            answer.add(distinct);
        }
        System.out.println(answer);
    }
}
