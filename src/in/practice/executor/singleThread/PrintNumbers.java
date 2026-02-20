package in.practice.executor.singleThread;

public class PrintNumbers implements Runnable {

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.printf ("Number is %d\n", i+1);
        }

    }

}
