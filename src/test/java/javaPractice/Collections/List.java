package javaPractice.Collections;

import java.util.*;


public class List {

    public static void main(String[] args) {

        java.util.List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // Set example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Bird");
        System.out.println("HashSet: " + hashSet);

        // Queue example
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");
        System.out.println("PriorityQueue: " + priorityQueue);

        // Deque example
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("First");
        arrayDeque.addLast("Last");
        System.out.println("ArrayDeque: " + arrayDeque);

        // Map example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);
    }
}
