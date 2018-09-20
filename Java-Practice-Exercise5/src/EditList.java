import java.util.List;

public class EditList {
    public List<String> toEdit(int indexToReplace, List<String> inputList, String element){
        System.out.println("List before editing " + inputList);
        inputList.set(indexToReplace, element);
        System.out.println("List after editing " + inputList);
        return inputList;
    }

    public int toClear (List<String> inputList){
        inputList.clear();
        System.out.println("The cleared list is "+ inputList);
        return inputList.size();
    }
}
