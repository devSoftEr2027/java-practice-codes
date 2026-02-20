package in.practice.extend;

public class TestShap {
    public static void main(String[] args) {
        Circle circle = new Circle ( 5.6 );
        System.out.printf("Area of Circle is %5.2f\n", circle.calculateArea ());

        Square square = new Square ( 25 );
        System.out.printf("Area of Square is %5.2f", square.calculateArea ());

    }
}
