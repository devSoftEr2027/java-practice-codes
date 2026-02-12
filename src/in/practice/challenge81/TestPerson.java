package in.practice.challenge81;

public class TestPerson {
    public static void main(String[] args) {
        Person obs1 = new Person ( 23, "Narayan" );
        Person obs2 = new Person ( 23, "Narayan" );
    if ( obs1.equals ( obs2 )){
        System.out.println (" Equals");
    } else {
        System.out.println ("Not Equal");
    }

    }
}
