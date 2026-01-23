import java.util.Scanner;

class GuessingGame {
    int random;
    GuessingGame(){
           random= (int) Math.ceil ( Math.random () * 100 );
    }

    int guess( int guessNumber ){
        return guessNumber - random;
    }


     public static void main(String[] args) {
         Scanner input = new Scanner ( System.in );
         GuessingGame game = new GuessingGame ();
         System.out.println (" Please Enter Your GuessNumber Between 1 to 100\n");
         int guess;
         int result;
         do{
             System.out.print (" Guess a Number-- ");
              guess = input.nextInt ();
              result = game.guess (guess);
              if( result == 0){
                  System.out.println (" Congrats, Your guess is Coreect");
              } else if ( result < 0){
                  System.out.println (" Please Guess Higher");
             } else {
                  System.out.println (" Please Guess Lower ");
              }
         } while ( result != 0);
     }

}
