import java.util.Scanner;

class LetterCheck {
    public static void main(String[] args) {
        String alphabet;
        System.out.println("Enter an element - ");
        Scanner s = new Scanner(System.in);
        alphabet = s.nextLine();

        int len = alphabet.length();

        for ( int i = 0 ; i < len ; i++ ) {
            if ( alphabet.charAt(i) == 'a' || alphabet.charAt(i) == 'e' || alphabet.charAt(i) == 'i' || alphabet.charAt(i) == 'o' || alphabet.charAt(i) == 'u' ) {
                System.out.print("Vowel ");
            } else if( alphabet.charAt(i) >= 'a' && alphabet.charAt(i) <= 'z' ){
                System.out.print("Consonant");
            }else {
                System.out.print("Error");
            }
        }

    }
}
