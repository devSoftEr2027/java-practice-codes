package in.practice.multithreading.threadState;

public class TestThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadStatePractice t1 = new ThreadStatePractice ();

        System.out.printf ("\nCreate the thread %s", t1.getState ());
        t1.start ();
        t1.join ();
        System.out.printf ("\nthread finished %s", t1.getState ());
    }
}
