import java.util.Arrays;

public class AssignmentQues2 {
    // linear time complexity O(n);
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the lengths are the same; if not, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            return;
        }

        // Create an array to count the frequency of each character (for 26 lowercase
        // letters)
        int[] charCount = new int[26];

        // Iterate over each character in both strings simultaneously
        for (int i = 0; i < str1.length(); i++) {
            // Increment the count for the character in str1
            charCount[str1.charAt(i) - 'a']++;
            // Decrement the count for the character in str2
            charCount[str2.charAt(i) - 'a']--;
        }

        // If all counts are zero, then the strings are anagrams
        boolean isAnagram = true;
        for (int count : charCount) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }

        // Output the result based on the boolean flag
        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams of each other");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }
}
