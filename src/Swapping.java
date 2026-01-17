import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station\n\n");
        System.out.print("Enter Your Number \'A\' ");
        int a= input.nextInt();
        System.out.print("Enter Your Number \'B\' ");
        int b = input.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("Value of A  "+ a);
        System.out.println("Value of B  "+ b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);





    }
}
