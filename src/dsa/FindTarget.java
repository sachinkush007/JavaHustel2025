package dsa;

import java.util.List;

public class FindTarget {
    public static boolean targetedEle(int arr[],int target) {

        for (int i = 0; i < arr.length ; i++) {
                if (target == arr[i]) {
                    return true;
                }
        }
        return false;
    }

        public static void main (String[]args){
            int[] nums = {2, 11, 7, 15};
            int target = 11;

            List<Integer> list = List.of(2, 11, 7, 15);

            System.out.println(targetedEle(nums,target));
        }

}