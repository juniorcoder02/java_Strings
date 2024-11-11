public class LargestString {

    // Function to find the lexicographically largest string in an array
    public static String largestString(String[] strings) {
        // Assume the first string is the largest initially
        String largest = strings[0];

        // Loop through the array starting from the second string
        for (int i = 1; i < strings.length; i++) {
            // Compare the current largest with the current string
            // If the current string is lexicographically larger, update the largest
            if (largest.compareTo(strings[i]) < 0) {
                largest = strings[i];
            }
        }

        // Return the largest string found
        return largest;
    }

    public static void main(String[] args) {
        // Create an array of strings
        String[] fruits = { "apple", "mango", "banana", "orange" };

        // Call the function and print the lexicographically largest string
        System.out.println("Largest string is: " + largestString(fruits));
    }
}
