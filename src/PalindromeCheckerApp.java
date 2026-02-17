public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String inputText = "madam";   // hardcoded input
        String reversedText = "";

        for (int i = inputText.length() - 1; i >= 0; i--) {
            reversedText = reversedText + inputText.charAt(i);
        }

        boolean isPalindrome = inputText.equals(reversedText);

        System.out.println("Input Text : " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
