import java.util.ArrayList;
import java.util.List;

public class VowelRemove {
    public String[] removevowels (StringBuilder[] places) {
        List<StringBuilder> withoutVowels = new ArrayList<>();
        for (int i = 0; i < places.length; i++) {
            StringBuilder afterremoval = toRemoveVowels(places[i]);
            withoutVowels.add(afterremoval);
        }
        String[] answer = withoutVowels.toArray(new String[withoutVowels.size()]);
        return answer;
    }

    private StringBuilder toRemoveVowels(StringBuilder places){

        for (int i=0;i<places.length();i++)
        {
            if(places.charAt(i)== 'a' || places.charAt(i)=='e' || places.charAt(i)=='i' || places.charAt(i)=='o' || places.charAt(i)=='u'){
                places.setCharAt(i,' ');
            }
        }

        return places;
    }

}
