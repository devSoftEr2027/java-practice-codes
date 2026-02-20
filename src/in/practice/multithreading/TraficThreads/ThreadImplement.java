package in.practice.multithreading.TraficThreads;

public class ThreadImplement implements Runnable {
    private final TrafficColour colour;


    public ThreadImplement(TrafficColour colour) {
        this.colour = colour;
    }


    @Override
    public void run() {
        System.out.printf ( "%s active\n" , colour );
        try {
            Thread.sleep ( colour.getOnTimeInMills () );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
        System.out.printf ("%s Inactive\n", colour);
    }
}
