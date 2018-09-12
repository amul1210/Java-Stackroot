import java.util.Scanner;

class LetterCheck {
    static String consonantvowel(String alphabet) {

        int len = alphabet.length();
        String answer="";

        for ( int i = 0 ; i < len ; i++ ) {
            if ( alphabet.charAt(i) == 'a' || alphabet.charAt(i) == 'e' || alphabet.charAt(i) == 'i' || alphabet.charAt(i) == 'o' || alphabet.charAt(i) == 'u' ) {

                answer=answer+"Vowel"+" ";
            } else if( alphabet.charAt(i) >= 'a' && alphabet.charAt(i) <= 'z' ){
                answer=answer+"Consonent"+" ";
            }else {
                answer=answer+"error"+" ";
            }
        }answer.trim();
        return answer;

    }
}
