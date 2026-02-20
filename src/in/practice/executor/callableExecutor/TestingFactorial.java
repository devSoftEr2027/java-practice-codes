package in.practice.executor.callableExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool ( 2);
        try{
            List<Future<Integer>> list = new ArrayList<> ();
            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator ( i );
                list.add ( service.submit ( task ));
            }
            service.shutdown ();
            if(!service.awaitTermination (8, TimeUnit.SECONDS)){
                System.out.print ("\nEmergency Termination..");
                service.shutdownNow ();
            }
            for(Future<Integer> future : list) {
                System.out.printf ( "\n Result is: %d" , future.get () );
            }
        } catch (Exception e) {
            System.out.printf ("\n Exception Coming..%s ", e.getMessage () );
        }
    }
}
