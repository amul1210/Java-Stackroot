import java.util.Scanner;

public class CharAppearances {
    public int CountChar(String inputChar , String inputString) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String to check - ");
//        String inputString = sc.nextLine();
//        System.out.println("Enter the Char you wish to find in the String");
//        String inputChar = sc.nextLine();
        String[] arrOfString = inputString.split(inputChar, -1);
        int noOfAppearances = arrOfString.length - 1;
//        System.out.println("No. of time " + inputChar + "appeared is " + noOfAppearances);
        return noOfAppearances;
    }
}
