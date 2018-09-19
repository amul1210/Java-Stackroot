import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordOccurrence {
    public List<String> findOccurancesOf(String inpString, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inpString);
        List<String> answer = new ArrayList<>();
        while (matcher.find()){
            System.out.println("Found at: " + matcher.start() + " - " + matcher.end());
            answer.add("Found at: " + matcher.start() + " - " + matcher.end());
        }return  answer;
    }
}
