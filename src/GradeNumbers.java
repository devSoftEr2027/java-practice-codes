import java.util.Scanner;

public class GradeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Grade Countable Caluclator:\n");
        System.out.print("Please Enter Your Marks: ");
        int marks = input.nextInt();
        double per = (marks*100)/1000;
        if(per>=90){
            System.out.println("Excellent' You have Got \'A\' Grade:");
        } else if (per>=75) {
            System.out.println("Good' You have Got 'B' Grage:");
        } else if (per>=60) {
            System.out.println("You have Got 'C' Grade:");
        } else if (per>=30) {
            System.out.println("Bad Score' You have Got 'D' Grade:");
        } else if (per<30) {
            System.out.println("You have Got 'F' Grade (Fail)!!\n\n");
            System.out.println(" Thank You ");

        }

    }
}
