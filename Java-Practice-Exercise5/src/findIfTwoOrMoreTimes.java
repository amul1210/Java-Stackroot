import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findIfTwoOrMoreTimes {
    public Map<String,Boolean> toCount(String[] inputString){
        String testString = Arrays.toString(inputString);
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(testString);
        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Boolean> answer = new HashMap<>();
        while (matcher.find()){
            if (wordCount.containsKey(matcher.group())){
                wordCount.put(matcher.group(), wordCount.get(matcher.group()) + 1);
            }else {
                wordCount.put(matcher.group(), 1);
            }

        }
        for(Map.Entry<String, Integer> e : wordCount.entrySet()) {
            if (e.getValue() >= 2){
                answer.put(e.getKey(), true);
            } else {
                answer.put(e.getKey(), false);
            }
        }
        return answer;
    }
}
