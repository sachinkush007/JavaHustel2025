package java8;

import java.util.List;

public class SimpleyJava {

   public static Boolean findTarget(int[] arr,int target){
       int f = 0;
       int l = arr.length - 1;
       while (f <= l) {
           int mid=(f+l)/2;
           if(arr[mid]==target){
               return true;
               //System.out.println("true");
           }
           if(target<arr[mid]){
               l=mid-1;
           }
           else {
               f=mid+1;
           }
       }
       return false;
    }
    public static void main(String[] args) {

        int arr[] = {1, 3, 6, 7, 9, 10, 13, 17};
        int target = 15;


        System.out.println(findTarget(arr,target));



    }


//    Select id,name from Emloyeee
//            where salery=(Select MAX(salery) from Employee)
}
