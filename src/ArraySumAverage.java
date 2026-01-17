import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[]args){
        Scanner input = new Scanner ( System.in );
        System.out.println ("Welcome to Array Sum And Average");
        int[] numArray = ArrayUtility.inputArray ();
        long sum = sum(numArray);
        double avg = average ( numArray);
        System.out.println ("sum of the numbers is:"+ sum);
        System.out.println (" Average of the numbers is:" +avg);

    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i< numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        double sum =  sum(numArray);
        return (sum/ numArray.length);

    }
}
