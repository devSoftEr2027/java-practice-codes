import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("Result is: "+ result);
    }
}
