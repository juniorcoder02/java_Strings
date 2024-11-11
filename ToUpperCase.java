public class ToUpperCase {
    // linear time complexity is O(n) for both best and worst case
    // Function to convert the first character of each word to uppercase
    public static String toUpperCase(String str) {
        // StringBuilder for efficient string construction
        StringBuilder sb = new StringBuilder();

        // Check if the string is empty to avoid errors
        if (str.length() == 0) {
            return str;
        }

        // Convert the first character of the string to uppercase and append it
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Iterate over the rest of the string
        for (int i = 1; i < str.length(); i++) {
            // If the current character is a space and the next character exists, uppercase it
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' '); // Append the space
                i++; // Move to the next character
                sb.append(Character.toUpperCase(str.charAt(i))); // Uppercase and append it
            } else {
                // Append the current character as is
                sb.append(str.charAt(i));
            }
        }

        // Return the modified string
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test case: normal string
        String str = "hi i am adnan";
        // Output: "Hi I Am Adnan"
        System.out.println(toUpperCase(str));

        // Test case: string with multiple spaces
        String str2 = "hello   world";
        // Output: "Hello   World"
        System.out.println(toUpperCase(str2));

        // Test case: empty string
        String str3 = "";
        // Output: ""
        System.out.println(toUpperCase(str3));
    }
}
