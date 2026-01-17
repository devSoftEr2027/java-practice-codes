import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Number");
        int num = input.nextInt();
        if((num & 1) ==1){
            System.out.println("Number is Odd: ");
        } else {
            System.out.println("Your Number is Even");
        }


    }
}
