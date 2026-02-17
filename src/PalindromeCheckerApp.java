public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String inputText = "radar";   // hardcoded input
        char[] characters = inputText.toCharArray();

        boolean isPalindrome = true;
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Input Text : " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
