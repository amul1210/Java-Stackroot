public class ExceptionHandlingPractice {

    public static void main(String[] args){
        try{
            throw new Exception("new exception");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("I was here");
        }
    }
}

