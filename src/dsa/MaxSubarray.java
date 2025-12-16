package dsa;

public class MaxSubarray {

    public static void main(String[] args) {

        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int target=6;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum ==target) {
                    System.out.println(target);

                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+",");
                    }
                }
            }
        }
    }
}
