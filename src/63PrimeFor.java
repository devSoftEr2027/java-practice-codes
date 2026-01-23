import java.util.Scanner;

class PrimeFor {
     public static void main(String[] args) {
          Scanner input = new Scanner ( System.in );
          System.out.println (" Welcome to Prime Number--\n");
          System.out.print (" Please Enter Your Number ");
          int num = input.nextInt ();
          boolean isPrime = isPrime ( num );
          System.out.println (" Your Number is " +
                  ( isPrime ? " Prime " : " Not Prime "));
     }




     public static boolean isPrime ( int num){
          for ( int i = 2; i < num; i++){
               if ( num % i == 0){
                    return false;
               }
          }
          return true;

     }
}
