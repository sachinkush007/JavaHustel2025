package dsa;

public class BinarySearch {
    public static int binarySearch(int[] arr,int search){
        int first=0;
        int last=arr.length-1;
        int mid=0;
//        int mid=(first+last)/2;
//        System.out.println(first+"::"+last);
        while (first<=last){
            mid=(first+last)/2;
            if(arr[mid]==search)
                return mid;
            if (search>arr[mid]){
                first=mid+1;
            }
            else {
                last=mid-1;
            }
            //mid=(first+last)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,8,9,10,11};
        System.out.println(binarySearch(arr,10));

    }
}
