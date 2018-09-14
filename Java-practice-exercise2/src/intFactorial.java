public class intFactorial {
    public int findFinalFactorial(int i) {

        int j=1;
        try{
            for(j=1;j<=i;j++){
                int factorial = calculateFactorial(j);
                System.out.println("Factorial of " + j + " is: "+ factorial);
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Limit is " + j);
            return j;

        }
        return i;
    }

    private int calculateFactorial(int j) throws Exception {
        int factorial = 1;
        for(int i = j;i>0; i--) {
            if(factorial < 0)
                throw new Exception("out of range");
            factorial *= i;

        }
        return factorial;
    }
}
