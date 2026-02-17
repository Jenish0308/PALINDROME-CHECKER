import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String inputText = "civic";   // hardcoded input

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to queue and stack
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        // Compare queue and stack values
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input Text : " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
