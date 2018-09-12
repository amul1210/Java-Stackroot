import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String alphabet) {

        String a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String: ");
        a = "";
        a = alphabet;
        int len = a.length();
        String answer = "";
        for ( int i = len - 1; i >= 0; i-- ) {
            System.out.print(a.charAt(i));
            answer= answer + a.charAt(i)+ " ";
        }answer=answer.trim();
        return answer;
    }
}