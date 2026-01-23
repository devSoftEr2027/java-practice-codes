import java.util.Scanner;

class DiceRoll {

    int roll(){
        double randome = Math.random () * 6;
        return (int) Math.ceil ( randome );
    }

    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll ();
        for (int i = 0; i < 10; i++) {
            System.out.println ( dice.roll () );
        }
    }
}
