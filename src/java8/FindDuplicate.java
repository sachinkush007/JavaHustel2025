package java8;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static List<Integer> findDuplicate(List<Integer> list){

        Set<Integer> duplicates = new TreeSet<>();
        List<Integer> collect=list.stream().filter(e->!duplicates.add(e)).toList();
        return collect;
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
    }
}
