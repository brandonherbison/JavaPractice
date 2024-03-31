package com.gradle.tutorial;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement); // Output: Popped Element: 30

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement); // Output: Top Element: 20

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty); // Output: Is Stack Empty? false
    }
}
