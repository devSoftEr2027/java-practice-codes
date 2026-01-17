import java.sql.SQLOutput;
import java.util.Scanner;

public class UnaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=8;
        System.out.println(++a);
        System.out.println(a);

        int b=5;
        ++b;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);

    }
}
