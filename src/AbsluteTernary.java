import java.util.Scanner;

class AbsluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.println (" Welcome to Abslutr Value--\n");
        System.out.print (" Please Enter Your Number: ");
        int num = input.nextInt ();
        int result = num >= 0 ? num : -num;
        System.out.println (" Absolute value is: " + result);
    }
}
