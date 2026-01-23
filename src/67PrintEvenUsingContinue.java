import java.util.Scanner;

class PrintEvenUsingContinue {

     public static void main(String[] args) {
         Scanner input = new Scanner ( System.in );
         System.out.println (" Welcome To Print Only Even Number By Using Continue--\n");
         System.out.print (" Plese Enter Your Number Where You want Do Sum: ");
         int num = input.nextInt ();
         int sum = 0;
         for( int i = 1; i <= num; i++){
             if( i % 2 != 0){
                 continue;
             }
             sum +=i;
         }
         System.out.println ( " Sum Of All Even Number " + sum);
     }


}
