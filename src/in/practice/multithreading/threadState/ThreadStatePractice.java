package in.practice.multithreading.threadState;

public class ThreadStatePractice extends  Thread{


    public void run() {
        try {
            Thread.sleep ( 4000 );
            System.out.printf ("\nFrom Inside run %s",getState ());
        } catch (InterruptedException e){
            throw new RuntimeException (e);
        }
    }
}
