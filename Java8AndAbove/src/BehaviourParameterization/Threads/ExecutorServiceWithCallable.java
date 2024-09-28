/**
 *  This example contains behavior parameterization with the implementation
 *  of callable interface using lambdas.
 *  Note that behaviour parameterization without using lambdas is commented out.
 *  By looking at commented code we can see how much boilerplate code reduced when
 *  using lambdas
 */

package BehaviourParameterization.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceWithCallable {
    public static void main(String[] args) {
        Future<String> threadName;

        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            /*
             * threadName = executorService.submit(new Callable<String>(){
             *   @Override
             *  public String call() throws Exception {
             *      return Thread.currentThread().getName();
             *  }
             * });
             */

            threadName = executorService.submit(() -> Thread.currentThread().getName());
            executorService.shutdown();
        }
        System.out.println("Thread Name: "+threadName);
    }
}
