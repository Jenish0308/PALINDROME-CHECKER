public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String inputText = "madam";   // hardcoded input

        String reversedText = new StringBuilder(inputText)
                .reverse()
                .toString();

        boolean isPalindrome = inputText.equals(reversedText);

        System.out.println("Input Text : " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
