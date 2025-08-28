package java8;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class OptionalClass {

    public static Optional<String> getId(int id) {
        String s = "sachin";
        return Optional.of(s);
    }

    public static Optional<String> getName(int id) {
        String name = "Rohit";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {
        Optional<String> s = getName(1);
        if (s.isPresent()) {
            System.out.println(s.get().toUpperCase());
        }
        System.out.println("*************************************");
        Optional<String> name = getId(10);
        name.ifPresent(string -> System.out.println(string.toUpperCase()));


        int a=10,b=20;
        Thread thread=new Thread(()-> {
            int i = a + b;
            System.out.println(i);
        });

        thread.start();
    }


}
