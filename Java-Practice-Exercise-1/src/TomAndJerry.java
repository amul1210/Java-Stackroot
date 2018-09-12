import java.util.Scanner;

class TomAndJerry {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Number - ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if ( num > 20 && num < 30 ){
            if( num%2 == 0 ) {
                System.out.print("Jerry");
            }
            else { System.out.print("Tom");}
        }
        else{
            System.out.print("error");
        }

    }
}