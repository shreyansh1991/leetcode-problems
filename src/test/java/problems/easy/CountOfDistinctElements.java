package problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CountOfDistinctElements {
    public static void main(String[] args) {
        int[] integerArray = {10, 20, 20};
        AtomicInteger countOfDistinctInteger = new AtomicInteger();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : integerArray) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        map.entrySet().parallelStream().forEach(entry -> {
            if (entry.getValue() == 1) {
                countOfDistinctInteger.getAndIncrement();
            }
        });
        System.out.println(countOfDistinctInteger.get());
    }
}
