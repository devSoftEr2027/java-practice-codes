import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Your Number");
        int num = input.nextInt();
        int result = num>>1;
        System.out.println(" Result is: "+result);
    }
}
