import java.util.Arrays;

public class ConsecutiveOrNot {
    public String ConsecutiveCheck (String QueryString){
        String[] numbers = QueryString.split(",");
        int[] Numbers = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            int tempnum = Integer.parseInt(numbers[i]);
            Numbers[i] = tempnum;
        }
        Arrays.sort(Numbers);

        boolean consecutive = true;
        for(int i=1;i<Numbers.length;i++){
            if(Numbers[i] - Numbers[i-1] != 1){
                consecutive = false;
                break;
            }
        }
        if(consecutive == true)
            return QueryString + " are consecutive numbers";
        return QueryString + " non consecutive numbers";
    }
}
