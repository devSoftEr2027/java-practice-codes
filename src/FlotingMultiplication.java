import java.util.Scanner;

public class FlotingMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Floating Number: ");
        float firstNum = input.nextFloat();
        System.out.println("Enter Your Second Floating Number: ");
        float secondNum = input.nextFloat();
        float multiply = firstNum * secondNum;
        System.out.println("Rsult "+ multiply);
    }
}
