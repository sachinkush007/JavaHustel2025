package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();

        synchronized (worker) {
            worker.start();
            worker.setName("sachin 1");
            // Example of wait()
            System.out.println("Main thread waiting for worker...");
            worker.wait();
            System.out.println("Main thread got notified!");

            // Example of join()
            Worker anotherWorker = new Worker();
            anotherWorker.setName("sachin 2");
            anotherWorker.start();
            anotherWorker.join();
            System.out.println("Main thread continued only after anotherWorker finished.");
        }


    }
}

class Worker extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is working...");
            try {
                // Example of sleep()
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " finished work, now notifying...");

                // notify any waiting thread
                this.notify();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
