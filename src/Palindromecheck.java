import java.lang.*;
import java.util.Scanner;

class Palindromecheck {
    public static void main(String[] args) {

        long num;  //input number
        long remainder;
        long sum;
        long temp;
        long sumeven;

        System.out.println("Enter a Number - ");
        Scanner in = new Scanner(System.in);
        num = in.nextLong();
        sum = 0 ;
        sumeven = 0 ;
        temp = num ;

        while( num > 0 ) {
            remainder = num % 10 ;
            sum =( sum * 10 ) + remainder ;
            num = num / 10 ;
            if( remainder % 2 == 0 ){
                sumeven = sumeven + remainder ;
            }
        }
        if( temp == sum ){
            System.out.print("Number is a Palindrome and ");
        } else{
            System.out.print("Number is not a Palindrome and");
        }
        if( sumeven > 25 ){
            System.out.print("sum of even numbers is greater than 25");
        } else{
            System.out.print("sum of even numbers is less than 25");
        }

    }
}




