package in.practice.executor.callableExecutor;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {

   private final int number;

   public FactorialCalculator(int number){
       this.number = number;
   }

    @Override
    public Integer call() throws Exception {
       int result = 1;
          Thread.sleep ( 2000 );
          if(number <= 1){
              return 1;
          }
          for(int i = 2; i <= number; i++){
              if(Thread.currentThread ().isInterrupted ()){
                  return -1;
              }
              result  *= i;
          }
      return result;
    }
}
