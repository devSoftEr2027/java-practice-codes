import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Sum Calculater\n");
        System.out.print("Please Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Now,Enter Your Second Number: ");
        int second = input.nextInt();
        int sum = first+second;
        System.out.println("Result is... " + sum);
    }
}
