import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Please Enter Your Two Numbers..  ");
        Scanner input= new Scanner(System.in);
        int FirstNumber= input.nextInt();
        int SecondNumber= input.nextInt();
        int sum = FirstNumber+SecondNumber;
        System.out.println("Sum Of Two Numbers is.. "+ sum);
    }
}
