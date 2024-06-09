package collections;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        // Adding entries to the hashmap
        hashmap.put("apple", 9191);
        hashmap.put("banana", 12);
        hashmap.put("cherry", 13);
        hashmap.put("date", 14111);
        hashmap.put("elderberry", 15);
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(hashmap.entrySet());
//        Collections.sort(entries, (e1, e2) -> e1.getValue().compareTo(e2.getValue())); this also works.
        Collections.sort(entries, (e1, e2) -> e1.getValue() - e2.getValue());
        System.out.println(entries);
    }

}
