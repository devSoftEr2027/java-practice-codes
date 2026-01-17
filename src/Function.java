import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In Main Method: ");
        greetUser();
        System.out.println("Method Calling Complete");
    }
    public static void greetUser(){
        System.out.println("Good Morning From Kg Coding");
    }
}
