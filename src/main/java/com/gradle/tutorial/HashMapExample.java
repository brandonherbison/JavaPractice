package com.gradle.tutorial;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store student IDs and corresponding names
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding entries to the HashMap
        studentMap.put(1001, "Alice");
        studentMap.put(1002, "Bob");
        studentMap.put(1003, "Charlie");
        studentMap.put(1004, "Johnny");

        // Retrieving values from the HashMap using keys
        System.out.println("Student with ID 1002: " + studentMap.get(1006)); // Output: Bob

        // Iterating over entries in the HashMap
        for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println(studentMap);
    }
}
