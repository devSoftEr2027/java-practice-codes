import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound interest Calculater\n\n");
        System.out.print("Enter Your Amount.. ");
        float amount = input.nextFloat();
        System.out.print("Now, Enter Your Rate.. ");
        float rate = input.nextFloat();
        System.out.print("And Finally, Enter Time Duration  in Month.. ");
        float time = input.nextFloat();
        double interest = amount*Math.pow((1+rate/100),time);
        System.out.println(interest);

    }
}
