package multithreading.thread.creation.example1;

/**
 * @Author Anjana Shankar
 * @Created 2020-09-22
 */
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in thread "+Thread.currentThread().getName()+ " before starting new thread");
                throw new RuntimeException("Internal Exception");
            }
        });
        thread.setName("Worker-0");
        thread.setPriority(Thread.MAX_PRIORITY);

        //very powerful feature
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in the thread "+t.getName()+" the error is "+e.getMessage());
            }
        });

        System.out.println("We are in thread "+Thread.currentThread().getName()+ " before starting new thread");
        thread.start();
        System.out.println("We are in thread "+Thread.currentThread().getName()+ " after starting new thread");
        Thread.sleep(10000);
    }
}
