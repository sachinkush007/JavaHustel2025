package java8;

import java.util.Arrays;
import java.util.Map;

import java.util.stream.Collectors;


public class OccurrenceOfWordInString {
    public static void main(String[] args) {
        String str="Apple Banana Apple Mango";

       Map<String,Long> map= Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(map);
    }

}
