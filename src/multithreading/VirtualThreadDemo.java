package multithreading;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Thread>threads=new ArrayList<>();
        final int threadCount=10000000;
        Runnable runnable=()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        for(int i=0;i<threadCount;i++){
            Thread thread=new Thread(runnable);
//                    .ofVirtual().unstarted(runnable);
            thread.setName("Thread-"+i);
            thread.start();
            System.out.println("Thread Number: "+i);
            threads.add(thread);
        }
        for(Thread thread:threads){
            thread.join();
            System.out.println("Completed: "+thread.getName());
        }
    }
}
