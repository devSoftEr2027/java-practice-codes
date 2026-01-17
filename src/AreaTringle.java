import java.util.Scanner;

public class AreaTringle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Value of Base: ");
        double base = input.nextDouble();
        System.out.print("Now Enter The Value Of Hight: ");
        double hight = input.nextDouble();
        double area = (base * hight)/2;
        System.out.println("Area of Tringle.. "+area);
    }
}
