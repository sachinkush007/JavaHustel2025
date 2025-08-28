package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max);

        Optional<String> longest = Stream.of("Java", "SpringBoot", "AWS")
                .reduce((a, b) -> a.length() > b.length() ? a : b);
        System.out.println(longest);
    }

}
