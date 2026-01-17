import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Calculator\n");
        System.out.print("Please Enter the Year that you want to Check: ");
        int year = input.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Your year is a Leap Year");
        }
        else {
            System.out.println("Your Year is Not Leap Year");
        }

    }
}
