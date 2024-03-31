package practice;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str1 = "({[]})"; // Balanced string
        String str2 = "({[})";  // Unbalanced string

        System.out.println("Is str1 balanced? " + isBalanced(str1)); // Output: Is str1 balanced? true
        System.out.println("Is str2 balanced? " + isBalanced(str2)); // Output: Is str2 balanced? false
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                // Unmatched closing bracket or extra closing bracket
                return false;
            }
        }

        // Stack should be empty if all brackets are balanced
        return stack.isEmpty();
    }
}

