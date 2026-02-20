package in.practice.enumTest;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println ("Printing All the days of the week");
        System.out.println (Day.MONDAY);
        System.out.println (Day.THURSDAY);

        for (Day value : Day.values ()) {
            System.out.printf ("%s ",value);
        }
    }
}
