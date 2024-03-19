package Th1Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Duc", 23);
        hashMap.put("Huy", 24);
        hashMap.put("An", 23);
        hashMap.put("Quy", 28);
        hashMap.put("Quan", 23);

        System.out.println("Display HasMap ");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display TreeMap: ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Khoa", 23);
        linkedHashMap.put("Hung", 28);
        linkedHashMap.put("Dat", 27);
        linkedHashMap.put("Quang", 26);
        System.out.println("Display linkedHashMap: ");
        System.out.println(linkedHashMap);
        System.out.println("\nDuc age: " + linkedHashMap.get("Khoa"));
    }
}
