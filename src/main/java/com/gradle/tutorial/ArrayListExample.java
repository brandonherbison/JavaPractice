package com.gradle.tutorial;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements using index
        System.out.println("Element at index 1: " + numbers.get(1)); // Output: 20

        // Removing an element
        numbers.remove(1); // Removes element at index 1

        // Iterating over elements
        System.out.print("ArrayList elements: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: ArrayList elements: 10 30

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + numbers.size()); // Output: 2
    }
}

