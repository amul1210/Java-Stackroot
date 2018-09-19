public class FindHarry {
    public boolean findHarry(String inputString){
        boolean b = false;
        if(inputString.matches(".*?\\bHarry\\b.*?") == true){
            System.out.println("Is Harry here? True");
            b=true;
            return b;
        }else {
            System.out.println("Is Harry here? False");
            return b;
        }
    }
}
