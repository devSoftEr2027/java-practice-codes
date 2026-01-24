import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        int num  = 5;
        int guess;
        System.out.println (" Welcome to the number gussing game--\n");
        do{
            System.out.print (" Please guess the number between 0 and 10 ");
             guess = input.nextInt ();
        } while ( num != guess );
        System.out.println (" You Have Successfully guessed the numbeer");
    }
}
