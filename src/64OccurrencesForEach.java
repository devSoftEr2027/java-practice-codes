import java.util.Scanner;

class OccurrencesForEach {
     public static void main(String[] args) {
         Scanner input = new Scanner ( System.in );
         System.out.println (" Welcome to OccurencesForEach Loop Practice\n");
         int[] arr = ArrayUtility.inputArray ();
         System.out.print (" Please Enter Your Number What You Want Search ");
         int num = input.nextInt ();
         int occurrence = countOccurrence ( arr, num );
         System.out.println (" Your elements was found: " + occurrence + " Times ");
     }

     public static int countOccurrence(int[] arr, int num){
        int occ = 0;
        for ( int nums : arr){
            if ( nums == num  ){
                occ++;
            }
        }
         return occ;
     }
}
