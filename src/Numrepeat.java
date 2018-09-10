import java.lang.*;
import java.util.Scanner;

public class Numrepeat {

    public static String numRepeat(int number) {

        int iter;
        System.out.println("Enter the number of iterations- ");
        Scanner in = new Scanner(System.in);
        iter = number;
        String answer="";
        for( int i=1 ; i < iter + 1 ; i++) {
            for ( int j = 0 ; j < i ; j++ ){
                System.out.print(i);
                answer=answer+i+" ";
            }
        }answer=answer.trim();
        return answer;
    }
}