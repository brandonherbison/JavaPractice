package practice;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Reverse the LinkedList in place
        reverseLinkedList(numbers);

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + numbers); // Output: Reversed LinkedList: [5, 4, 3, 2, 1]
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}

