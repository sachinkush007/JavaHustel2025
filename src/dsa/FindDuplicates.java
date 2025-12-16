package dsa;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static Set<Integer> findDuplicate(int[] arr){

        Set<Integer>duplicates=new HashSet<>();
        Set<Integer>set=new HashSet<>();

        for(Integer i:arr) {
            if(!set.add(i))
                duplicates.add(i);
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[]arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(findDuplicate(arr));

    }
}
