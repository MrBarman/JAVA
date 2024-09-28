/***
 * This is sample code for calling runnable using lambda
 * as part of behavior parameterization. The boilerplate code here reduced
 * significantly when using lambdas
 */

package BehaviourParameterization.Threads;

public class UsingLambda {
    public static void main(String[] args) {
        Thread t = new Thread(()->System.out.println("Using lambda"));
        t.start();
    }
}
