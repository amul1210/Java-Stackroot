import java.lang.*;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]) {

        try{
            System.out.println("Enter a number - ");    // Taking Input
            Scanner input = new Scanner(System.in);
            String in;
            in = input.nextLine();

            int length;
            int sum = 0;

            length = in.length();

            String strarray[] = in.split(" ");
            int intarray[] = new int[strarray.length];

            for (int count = 0; count < intarray.length; count++) {
                intarray[count] = Integer.parseInt(strarray[count]);
            }

            for (int count = 0; count < intarray.length; count++) {
                sum = sum + intarray[count];
            }
            System.out.println(sum);
        }
        catch(Exception e)
        {
            System.out.println("Illegal Input");
        }
    }
}