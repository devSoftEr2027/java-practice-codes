import java.util.Objects;
import java.util.Scanner;

class ExitOnExit {
     public static void main(String[] args) {
         Scanner input = new Scanner ( System.in );
         System.out.println (" Welcome To Use Of Break For Exit On Exit\n");
  //       String code;
//         do {
//             System.out.print (" Please Enter Code  ");
//             code = input.next ();
//         } while (!Objects.equals ( code , "Exist" ));
//         System.out.println (" Okk You Can Exist ");
          while (true){
              System.out.print (" Enter Your Command: ");
              String code = input.next ();
              if( Objects.equals (code, "Exit" )) {
                  break;
              }
          }
         System.out.println (" Now You Can Exit ");
     }
}
