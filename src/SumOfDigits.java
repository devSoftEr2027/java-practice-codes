import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Digit of Sum ");
        System.out.print(" Please Enter Your Number: ");
        long num = input.nextLong();
        long sum = sumOfSum(num);
        System.out.println(" Sum of Digits is: "+ sum);
    }
    public static long sumOfSum(long num){
       long sum = 0;
        while (num>0){
            sum = sum+(num%10);
            num= num/10;
        }
        return sum;

    }
}
