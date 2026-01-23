import java.util.Scanner;

class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.println (" Welcome To Multiplication Table Using For Loop-- ");
        System.out.print (" Please Enter Your Number Which You Want Multiplication Table..  ");
        int num = input.nextInt ();
        table ( num );
    }

    public static int table( int num){
         int multiplication;
        for( int i = 1; i <= 10; i++){
            multiplication = (num * i);
            System.out.println ( num + " X "+ i + " = " + multiplication);
        }
        return 0;
    }
}
