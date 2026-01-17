import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Principle Amount Rs.. ");
        int amount = input.nextInt();
        System.out.print("Enter Time Duration in Month.. ");
        double time = input.nextDouble();
        System.out.println("Enter Your Rate.. ");
        int rate = input.nextInt();
        double interest = (amount*time*rate)/100;
        System.out.println("Interest.. "+ interest);
    }
}
