import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String inputText = "noon";   // hardcoded input
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < inputText.length(); i++) {
            stack.push(inputText.charAt(i));
        }

        String reversedText = "";

        // Pop characters to form reversed string
        while (!stack.isEmpty()) {
            reversedText = reversedText + stack.pop();
        }

        boolean isPalindrome = inputText.equals(reversedText);

        System.out.println("Input Text : " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
