import java.util.Scanner;
public class ArrayUtility{
    public static int[] inputArray(){
        Scanner input = new Scanner ( System.in);
        System.out.print (" Please Enter The number of elements  ");
        int size  = input.nextInt();
        int[]nums = new int [size];
        int i = 0;
        while (i < size) {

            System.out.print ( "Please Enter elements no" + (i + 1) + ":  " );
            nums[i] = input.nextInt ();
            i++;
        }
            return nums;

    }
    public static void displayArray(int[] numArray){
        int i= 0;
        while(i< numArray.length){
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println ();
     }

    public static int[][] input2DArray(){
        Scanner input = new Scanner (System.in);
        System.out.print(" please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print(" Please Enter the numbers of Columns: ");
        int columns = input.nextInt ();
        int[][] numArray = new int[rows][columns];
        int i = 0;
        while(i < rows) {
            int j = 0;
            while ( j< columns){
                System.out.println ("Please enter element row:" + (i+1)
                + ", column: " + (j+1) + " :");
                numArray[i][j]= input.nextInt ();
                j++;
            }
            i++;
        }
        return numArray;
    }
}