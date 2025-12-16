package dsa;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {

        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[]arr={0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
    }
}
