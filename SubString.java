public class SubString {
    public static String substring(String str, int start, int end) {
        String substring = "";
        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(0, 5)); // in built function
    }
}
