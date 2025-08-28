package dsa;

public class FIndMinAndMax {
    public static int findMax(int []arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int findMin(int []arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] a = {10, 4, 6, 3, 9, 5, 9};
        System.out.println("Max: "+findMax(a));
        System.out.println("Min: "+findMin(a));
    }
}
