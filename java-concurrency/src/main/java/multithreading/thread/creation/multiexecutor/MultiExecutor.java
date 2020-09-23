package multithreading.thread.creation.multiexecutor;

/**
 * @Author Anjana Shankar
 * @Created 2020-09-23
 */

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

    // Add any necessary member variables here
    List<Runnable> tasks;

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
        this.tasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        List<Thread> threads = new ArrayList<>(tasks.size());
        for(Runnable t: tasks) {
            Thread th = new Thread(t);
            threads.add(th);
        }
        // complete your code here
        for(Thread t: threads) {
            t.start();
        }

    }

    public static void main(String[] args) {
        List<Runnable> rl = new ArrayList<>();
        rl.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                }
            }
        });

        rl.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 2");
            }
        });

        rl.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 3");
            }
        });

        MultiExecutor me = new MultiExecutor(rl);
        me.executeAll();
    }
}
