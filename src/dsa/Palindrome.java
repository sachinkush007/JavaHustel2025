package dsa;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Palindrome {
    public static int reverse(int n){
        int rev=0;
        while (n!=0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        return rev;

    }
    public static Boolean palindrome(int num){
        int rev=reverse(num);
        if(rev==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int num=121;
        System.out.println(reverse(num));
        System.out.println(palindrome(num));

      /*  ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future = executor.submit(() -> {
            return 5 + 10;
        });
        try {
            System.out.println("Result: " + future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/

    }
}
