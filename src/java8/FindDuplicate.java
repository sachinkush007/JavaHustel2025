package java8;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static List<Integer> findDuplicate(List<Integer> list){

        Set<Integer> duplicates = new TreeSet<>();
        List<Integer> collect=list.stream().filter(e->!duplicates.add(e)).toList();
        return collect;
    }

    public static void findDuplicateCount(List<Integer> list){

//        Map<Integer,Long> accourance=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));

         Map<Integer,Long> accourance=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));

        Set<Integer> duplicates=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(e->e.getKey())
                .collect(Collectors.toSet());
        System.out.println("Acc"+accourance);
        System.out.println(duplicates);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 2, 3, 1, 3, 5};
        List<Integer>list=List.of(1, 2, 3, 4, 2, 3, 1, 3, 5);

        Set<Integer> duplicates = new TreeSet<>();
        System.out.println("Using Java 8:"+findDuplicate(list));
        for (Integer num:arr){
            if(!duplicates.add(num)){
                System.out.print(num+" ");
            }
        }
        findDuplicateCount(list);
    }

}
