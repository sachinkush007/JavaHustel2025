package dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArray {

    public static void main(String[] args) {
        int []a = {7, -5, 3, 8, -4, 11, -19, 21};
        int []b = {6, 13, -7, 0, 11, -4, 3, -5};

        int[] merge=new int[a.length+b.length];

        //Using Java 8 without duplicate and sorted
         List<Integer> mergeArray= Stream.concat(Arrays.stream(a).boxed(),Arrays.stream(b).boxed()).sorted().distinct()
                .collect(Collectors.toList());
        System.out.println("Using Java 8:"+mergeArray);

        //Using Bruteforce
        for(int i=0;i<a.length;i++){
           merge[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            merge[a.length+j]=b[j];
        }
        for (int i: merge){
            System.out.print(i+",");
        }
    }

}
