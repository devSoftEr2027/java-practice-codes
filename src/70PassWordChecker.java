import java.util.Scanner;

class PassWordChecker {
    public static void main(String[] args) {
        Scanner enter = new Scanner ( System.in );
        System.out.println (" Welcome to Password Checker--\n ");
        String password;
        do{
            System.out.print( " Please Enter Your password: ");
            password = enter.next ();
        } while ( !isValidPassword ( password ));
        System.out.println (" Thanks for entering a valid password ");
    }


    public static boolean isValidPassword( String password){
        return password.length () > 6;
    }
}
