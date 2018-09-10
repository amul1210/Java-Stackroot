import java.util.Scanner;

class CharRepeat {
    public static void main(String[] args) {

        String word;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String:");
        word = s.nextLine();
        System.out.print("Enter a number");
        int x = s.nextInt();
        int len = word.length();
        for (int i = 0; i < len - x; i++) {
            System.out.print(word.charAt(i));
        }
        for (int i = 0; i < x + 1; i++) {
            for (int j = len - x; j < len; j++)
                System.out.print(word.charAt(j));
        }
    }
}