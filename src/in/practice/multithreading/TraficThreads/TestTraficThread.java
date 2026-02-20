package in.practice.multithreading.TraficThreads;

public class TestTraficThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadImplement red = new ThreadImplement (TrafficColour.RED);
        ThreadImplement yellow = new ThreadImplement ( TrafficColour.YELLOW );
        ThreadImplement green = new ThreadImplement ( TrafficColour.GREEN );

        Thread t1 = new Thread (red);
        Thread t2 = new Thread (yellow);
        Thread t3 = new Thread (green);

        t1.start ();
        t1.join ();
        t2.start ();
        t2.join ();
        t3.start ();
        t3.join ();

    }
}
