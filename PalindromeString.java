public class PalindromeString {
    public static void main(String[] args) {
        String str = "racecar"; // Initialize the string
        System.out.println(isPalindrome(str)); // Function call to check palindrome
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int n = str.length(); // Get the length of the string

        // Iterate over the first half of the string
        for (int i = 0; i < n / 2; i++) { 
            // Compare the character at index i with the character at the mirrored position from the end
            if (str.charAt(i) != str.charAt(n - i - 1)) { 
                return false; // Return false if a mismatch is found
            }
        }

        // If no mismatches are found, the string is a palindrome
        return true;
    }
}
