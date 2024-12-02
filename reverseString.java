public class reverseString {
    public static String reverseWords(String s) {
        // step 1 : trim the tring to remove leading and trailing spaces
        s = s.trim();
        // step 2 : split the strings into words
        String[] words = s.split("\\s+");
        // step 3: reverse the words using two pointer approach
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            // swap words[left] and words[right]
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        // step 4 : join words into a single string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                result.append(words[i] + " ");
            } else {
                result.append(words[i]);
            } // add a space after each word except for the last one
        }

        // return final result toString
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "My name is   Adnan  Qureshi";
        System.out.println(reverseWords(s)); // Output: "Qureshi Adnan is name My"

    }
}