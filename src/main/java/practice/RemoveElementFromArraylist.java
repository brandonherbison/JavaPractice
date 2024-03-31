package practice;

import java.util.ArrayList;

//Problem: Given an array of integers, convert it into an ArrayList and remove all occurrences of a specific element from the ArrayList.

public class RemoveElementFromArraylist {
    public static void main(String[] args) {
        // Sample array of integers
        int[] numsArray = {2, 3, 4, 2, 5, 6, 2};

        // Convert array to ArrayList
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int num : numsArray) {
            numbersList.add(num);
        }

        // Element to remove
        int elementToRemove = 2;

        // Remove all occurrences of the element
        numbersList.removeIf(num -> num == elementToRemove);

        //add element
        numbersList.add(9);

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + numbersList); // Output: Updated ArrayList: [3, 4, 5, 6]
    }
}

