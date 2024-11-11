public class StringCompression {
    // linear time complexity is O(n)

    // Function to compress the input string by replacing consecutive characters
    // with their counts
    public static String compression(String str) {
        // StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder();

        // Iterate over the string
        for (int i = 0; i < str.length(); i++) {
            int count = 1; // Start counting from 1 for each character

            // Count consecutive repeating characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++; // Increment count if next character is the same
                i++; // Move to the next character
            }

            // Append the current character to the result
            sb.append(str.charAt(i));

            // If the character repeats, append the count
            if (count > 1) {
                sb.append(count); // Convert count to string and append
            }
        }

        // Return the compressed string
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String str = "aaaaabbbbddccc"; // Input with repeating characters
        String str2 = "abcd"; // Input with no repeating characters

        // Print the compressed strings
        System.out.println(compression(str)); // Output: "a5b4d2c3"
        System.out.println(compression(str2)); // Output: "abcd"
    }
}
