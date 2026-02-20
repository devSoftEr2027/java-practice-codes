package in.practice.executor.multipleThread;

public class SleepTask implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread ();
        System.out.printf ( "\nCurrent Thread: %s" , current.getName () );
       try {
           Thread.sleep ( getRandome () * 1000 );
       } catch (InterruptedException e){
           throw new RuntimeException (e);
       }
        System.out.printf ("\nEnded Thread: %s", current.getName ());
    }

    private int getRandome(){
        double random = Math.random () * 5 + 1;
        return (int) random;
    }

}
