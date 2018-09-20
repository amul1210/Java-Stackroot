import java.util.HashMap;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public Map<String, Integer> counter(String inputString){
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(inputString);
        Map<String, Integer> wordCount = new HashMap<>();
        while (matcher.find()){
            if (wordCount.containsKey(matcher.group())){
            wordCount.put(matcher.group(), wordCount.get(matcher.group()) + 1);
            }else {
                wordCount.put(matcher.group(), 1);
            }
        }
        return wordCount;
    }
}
