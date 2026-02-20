package in.practice.multithreading.join;

public class ThreadPractice implements Runnable {

    public char character;

    public ThreadPractice(char character){
        this.character = character;
    }

    public char getThread() {
        return character;
    }

    @Override
    public void run() {
        System.out.printf("\nStarted %s  ", Thread.currentThread().getName ());
        for (int i = 0; i < 1000; i++) {
            System.out.printf ("%d%c ",i , character);
        }
        System.out.printf ("\nEnded %s  ",Thread.currentThread ().getName ());
    }
}
