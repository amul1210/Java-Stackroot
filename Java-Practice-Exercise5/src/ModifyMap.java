import java.util.Map;

public class ModifyMap {
    public Map<String, String> modifier(Map<String, String> inputMap) {
        if (inputMap.get("val1")!=null){
            inputMap.put("val2", inputMap.get("val1"));
            inputMap.put("val1"," ");
        }else {
            System.out.println("The value does not exist");
        }
        return inputMap;
    }
}
