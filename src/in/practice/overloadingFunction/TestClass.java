package in.practice.overloadingFunction;

public class TestClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator ();
        System.out.println (calculator.add ( 5,6 ));
        System.out.println (calculator.add(2,9,7));
        System.out.println (calculator.add(6.5, 9.4));
    }
}
