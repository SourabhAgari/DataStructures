package StriversDSA.basics.arrays;

import java.util.Arrays;

public class arrayProblems {
    // find the largest
    static int largest(int[] arr){
        int largest = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    // find the second Largest
    static int secondLargest(int[] arr){
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    // check if array is sorted or not
    static Boolean checkSorted(int[] arr){
        Boolean isSorted = false;
        for(int i =1;i<arr.length;i++){
            if (arr[i] >= arr[i-1]){
                isSorted = true;
            }
            else isSorted = false;
        }
        return isSorted;
    }
    // remove duplicates from an array : inplace
    static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    static int removeDups(int[] arr){
        int i = 0;
        for(int j=1; j<arr.length;j++){
            if(arr[j] != arr[j-1]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i-1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
