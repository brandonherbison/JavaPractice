package com.gradle.tutorial;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Removing an element
        names.removeLast(); // Removes the last element

        // Add names to beginning and end of list
        names.addFirst("Brandon");
        names.addLast("Johnny");

        // Accessing elements by index (not efficient for LinkedList)
        System.out.println("First name: " + names.getFirst()); // Output: First name: Alice

        // Iterating over elements
        System.out.print("LinkedList elements: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println(); // Output: LinkedList elements: Alice Bob
    }
}

