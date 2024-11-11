import java.util.*;

public class AssignmentQues1 {

    // Question 1 : Count how many times lowercase vowels occurred in a String
    // entered by the
    // user.

    public static int vowelCounter(String str) {
        int count = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < str.length(); i++) {
            for(int j  = 0;j<vowels.length;j++){
                if(str.charAt(i)==vowels[j]){
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(vowelCounter(str));
        sc.close();

    }
}
