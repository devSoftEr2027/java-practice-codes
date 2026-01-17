import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to LCM: ");
        System.out.print(" Please Enter Your first Number: ");
        int firstNum = input.nextInt();
        System.out.print(" Now, Enter Your Second Number: ");
        int secondNum = input.nextInt();
        int lcM = lCM(firstNum,secondNum);
        System.out.println(" Your LCM is: "+lcM);

    }
    public static int lCM(int firstNum, int secondNum){
        int i = 1;
        while(true){
            int factor = firstNum * i;
            if( factor % secondNum == 0){
                return factor;
            }
            i++;
        }
    }
}
