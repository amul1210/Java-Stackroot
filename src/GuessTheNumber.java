import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {

        int number = 37;
        int input;
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number:");
            input = s.nextInt();

            if (input > number)
                System.out.println("Number guessed is more than original number");
            else if (input < number)
                System.out.println("Number guessed is less than original number");
            else
                System.out.println("Number guessed matches original number");
        } while (input != number);
    }
}
