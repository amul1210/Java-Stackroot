import java.util.*;

public class SortedNames {
    public static  List<String> sorting(String[] inputString){
        int len = inputString.length;
        SortedSet<String> sortedString = new TreeSet<>();
        for (int i = 0; i <len; i++){
            sortedString.add(inputString[i]);
        }
        List<String> answer = new ArrayList<>(sortedString);
        return answer;
    }
    public static void main(String args[]){
        String[] input = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        List<String> answer = sorting(input);
        System.out.println(answer);
    }
}
