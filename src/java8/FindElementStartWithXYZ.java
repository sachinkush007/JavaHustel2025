package java8;

import java.util.Arrays;
import java.util.List;

public class FindElementStartWithXYZ {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50,35,33);
        List<String>stringList=numbers.stream().map(e->e.toString()).filter(e->e.startsWith("3")).toList();
//        List<String>result=stringList.stream().filter(e->e.startsWith("3")).toList();
//        System.out.println(result);
        System.out.println(stringList);

    }
}
