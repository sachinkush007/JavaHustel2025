package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(1,2,3,5,6,8,9,11,12);
        Map<String,List<Integer>>map=list.stream().collect(Collectors.groupingBy(e->e%2==0?"Even":"Odd"));
        System.out.println(map);
        map.forEach((k,v)->
                System.out.println(k+":"+v));
    }
}
