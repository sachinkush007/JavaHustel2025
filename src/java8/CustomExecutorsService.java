package java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomExecutorsService {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("Task is running in: " + Thread.currentThread().getName());
        };
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 4; i++) {
            final int taskNumber = i;
            executorService.execute(() -> {
                System.out.println("Task " + taskNumber + " started by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskNumber + " finished by " + Thread.currentThread().getName());

            });
        }
//        executorService.execute(runnable);
        executorService.shutdown();
    }
}
