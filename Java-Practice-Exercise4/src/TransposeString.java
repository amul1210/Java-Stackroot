public class TransposeString {
    public String toTranspose(String inputString) {
        if(inputString.length()==0){
            return null;
        }else {
            String[] arrOfWords = inputString.split(" ");
            String reverseString = "";
            int len = arrOfWords.length;
            for (int i = 0; i < len; i++) {
                String word = arrOfWords[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reverseString = reverseString + reverseWord + " ";
            }
            reverseString = reverseString.trim();
            return reverseString;
        }
    }
}
