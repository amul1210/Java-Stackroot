import java.util.Scanner;

class CharRepeat {
    public static String charRepeat(String word, int x) {

            try {
                String answer = "";
                int len = word.length();
                for (int i = 0; i < len - x; i++) {
                    System.out.print(word.charAt(i));
                    answer = answer + word.charAt(i) + "";
                }
                for (int i = 0; i < x + 1; i++) {
                    for (int j = len - x; j < len; j++) {
                        System.out.print(word.charAt(j));
                        answer = answer + word.charAt(j) + "";
                    }
                }
                answer = answer.trim();
                return answer;
            }
            catch(Exception e)
            {
                System.out.println("ERROR");
                return "ERROR";
            }
    }
}