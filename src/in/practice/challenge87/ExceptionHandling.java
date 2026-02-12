package in.practice.challenge87;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.println (" Welcome To Arithmetic Exception Handling..\n");
        System.out.print(" Please Enter Your First Number.. ");
        int a = input.nextInt ();
        System.out.print(" Now Enter Your Second Number..");
        int b = input.nextInt ();
        try {
           int c = a / b;
            System.out.printf("Answer is %d",c);
        } catch (ArithmeticException exception){
            if ( exception.getMessage ().equals ( "/ by zero" )){
                System.out.println ("Divide by zero occurred.");
            }else {
                throw exception;
            }
        }
    }
}
