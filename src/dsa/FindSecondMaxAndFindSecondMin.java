package dsa;

public class FindSecondMaxAndFindSecondMin {

    //Failed in If value are duplicate and -1 Values
    // By Tap Academy
    public static int secondLargest(int[] arr) {

        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max1 = 0, max2 = 0;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    // More optimise Solution
    public static int secondHighest(int[] arr) {

        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 3, 9, 5, 9};
        int secondHighest = secondHighest(a);
//        System.out.println(secondHighest);
        System.out.println(secondLargest(a));

        int max1=0;
        int max2=0;
        if(a[0]>a[1]){
            max1=a[0];
            max2=a[1];
        }
        else{
            max1=a[1];
            max2=a[0];
        }
        for(int i=2;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            } else if (a[i]>max2 && a[i]!=max1) {
                max2=a[i];
            }
        }
        System.out.println("Practice again"+max2);
    }
}
