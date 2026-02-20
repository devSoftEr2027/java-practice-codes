package in.practice;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println (concatenate ( "Narayan" ));
        System.out.println (concatenate ( "Narayan", "Dev" ));
        System.out.println (concatenate ( "Mr." ,"Dev" ));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder ();
        for(String i : strs){
            sb.append ( i ).append ( " " );
        }
        return sb.toString ();
    }
}
