import javax.xml.transform.Source;
import java.util.Scanner;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 5;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();
        a += x1;
        System.out.println("A=" +a);
        System.out.println("Enter x2: ");
        int x2 = input.nextInt();
        a -= x2;
        System.out.println("A=" +a);
        System.out.println("Enter x3: ");
        int x3 = input.nextInt();
        a *= x3;
        System.out.println("A=" +a);
        System.out.println("Enter x4: ");
        int x4 = input.nextInt();
        a /= x4;
        System.out.println("A=" +a);




    }
}
