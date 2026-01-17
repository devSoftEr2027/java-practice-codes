import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to PalindromeNumber:");
        System.out.print(" Please enter Your Number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println(" Your Number is a Palindrome Number");
        } else {
            System.out.println(" Your Number is a not Palindrome Number");
        }
    }
    public static boolean isPalindrome(int num) {
        int reverse = reverse(num);
        return num == reverse;
    }
    public static int reverse( int num){
        int newNum = 0;
        while(num>0){
            int digit = num% 10;
            newNum = newNum*10+digit;
            num/=10;
        }
        return newNum;
    }
}

