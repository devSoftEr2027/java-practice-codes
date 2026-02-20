package in.practice.multithreading.join;

public class TestThread {
    public static void main(String[] args) {
        ThreadPractice p1 = new ThreadPractice ( '*' );
        ThreadPractice p2 = new ThreadPractice ( '#' );
        ThreadPractice p3 = new ThreadPractice ( '&' );

        Thread t1 = new Thread (p1);
        Thread t2 = new Thread (p2);
        Thread t3 = new Thread (p3);

        try {
            t1.start ();
            t1.join ();
            t2.start ();
            t2.join ();
            t3.start ();
        } catch (InterruptedException exception){
            System.out.printf ("%s Exception Found", exception.getMessage ());
        }

    }
}
