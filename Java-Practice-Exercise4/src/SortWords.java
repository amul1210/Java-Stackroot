import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWords {
    public List<String> toSort(String inputString){
        String[] arrOfString = inputString.split(" ");
        List<String> listOfWords = new ArrayList<>();
        Collections.addAll(listOfWords, arrOfString);
        Collections.sort(listOfWords );
        return listOfWords;
    }
}
