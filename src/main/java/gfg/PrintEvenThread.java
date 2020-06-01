package gfg;

public class PrintEvenThread implements Runnable {

    private final Object lock;
    private int MAX;
    private int counter;
    private boolean bool = true;

    public PrintEvenThread(Object lock, int MAX, int counter) {
        this.lock = lock;
        this.MAX = MAX;
        this.counter = counter;
    }

    @Override
    public void run() {
       while (counter<MAX){
           synchronized (lock) {
               while (bool) {
                   try {
                       lock.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println(counter);
               counter += 2;
               bool = !bool;
               lock.notifyAll();
           }
       }
    }
}
