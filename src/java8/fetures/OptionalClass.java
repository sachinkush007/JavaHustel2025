package java8.fetures;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String str=null;
        String string="kumar";
        Optional<String>nameOpt=Optional.of(str);

        Optional<String>optional1=Optional.ofNullable(string);

        // 1. Check if value is present
        if (nameOpt.isPresent()) {
            System.out.println("Name: " + nameOpt.get());
        }

        // 2. ifPresent
        nameOpt.ifPresent(s -> System.out.println(s));

        // 3. orElse
        String name = nameOpt.orElse("No Name Found");
        System.out.println("Name is: " + name);

        // 4. orElseGet
        String name2=nameOpt.orElseGet(()->"Generated Name");
        System.out.println(name2);

        // 5. orElseThrow
        String name3=nameOpt.orElseThrow(()->new RuntimeException("No"));
        System.out.println(name3);
    }
}
