public class ReplaceDandL {
    public String toReplace(String inputString){
    String s1 = inputString.replace("d","f");
    String answer = s1.replace("l","t");
    return answer;
    }
}
