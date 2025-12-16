package java8;

import java.util.Arrays;
import java.util.List;

public class CommonElementBWTwoArray {

    public static void fetchCommonElement(int[] a,int[] b) {
        List<Integer>commonEle=Arrays.stream(a).filter(num->Arrays.stream(b).anyMatch(match->match==num)).boxed().toList();
        System.out.println(commonEle);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,5,6,7,8};
        fetchCommonElement(a,b);
    }
}
