package in.practice.multithreading.twothread;

public class TestClass {
    public static void main(String[] args) {
        ThreadPractice t1 = new ThreadPractice (1);
        ThreadPractice t2 = new ThreadPractice ( 2 );

        t1.start ();
        t2.start ();
    }
}
