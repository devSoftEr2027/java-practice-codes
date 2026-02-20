package in.practice.multithreading.twothread;

public class ThreadPractice extends Thread {
    public int x;

    public ThreadPractice(int x){
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.printf("Hello from Thread %d\n",x);

        }
    }
}
