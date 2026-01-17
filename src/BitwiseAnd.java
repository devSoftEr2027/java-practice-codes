import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator\n");
        System.out.print("Please Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int second = input.nextInt();
        int result = first & second;
        System.out.println("Result is: "+ result);
    }
}
