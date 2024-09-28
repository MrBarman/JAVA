/***
 This example contains behavior parameterization with the implementation
 of Runnable
 */

package BehaviourParameterization.Threads;

public class UsingRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Using Runnable");
            }
        });
        t.start();
    }
}
