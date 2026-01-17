import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker ");
        System.out.println(" Please Enter Your Number: ");
        int num = input .nextInt();
        boolean isprime = isPrime(num);
        if (isprime){
            System.out.println("Your Number is Prime");
        }else {
            System.out.println("Your Number is Not Prime");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}