package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String s="Sachin Kumar";
        String[] strChar=s.split(" ");

        String reverse= Arrays.stream(strChar).map(e->new StringBuilder(e).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
