import java.util.Scanner;

class SumPositive {
     public static void main(String[] args) {
         Scanner input = new Scanner ( System.in );;
         System.out.println ( " Welcome To Sum Positive Number ");
         int[] numArr = ArrayUtility.inputArray ();

         int sum = 0;
         for( int num : numArr){
             if( num < 0){
                 continue;
             }
             sum += num;
         }
         System.out.println (" The Sum of Positive numbers is: " + sum);
     }

}
