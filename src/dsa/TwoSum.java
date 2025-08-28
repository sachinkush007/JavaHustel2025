package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    //Using Array
    public static int[] findTarget(int[] arr, int target) {
        int nums[] = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp == arr[j]) {
                    nums[0] = i;
                    nums[1] = j;
                    break;
                }
            }

        }
        return nums;
    }

    //Using List
    public static int[] twoSum(List<Integer> list, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int temp = target - list.get(i);
            System.out.println("Temp "+temp);
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(list.get(i),i);
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] nums = {2,11,7, 15};
        int target = 9;

        List<Integer> list=List.of(2,11,7,15);
        System.out.println("Using Array: "+Arrays.toString(findTarget(nums, target)));

        System.out.println("Using HashMap "+Arrays.toString(twoSum(list,target)));
    }
}
