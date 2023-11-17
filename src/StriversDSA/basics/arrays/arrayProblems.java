package StriversDSA.basics.arrays;

import java.util.Arrays;

public class arrayProblems {
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
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
    // rotate array by d places
    static void rotateByDPlaces(int[] arr,int d){
        d = (d % arr.length);
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int j=d;j<arr.length;j++){
            arr[j-d] = arr[j];
        }
        int l = 0;
        for(int k=arr.length-d;k<arr.length;k++){
            arr[k] = temp[l];
            l++;
        }
    }
    // move zeroes to the end
    static void moveZeros(int[] arr){
        int j = -1;
        // find the index of first occurrence of the 0
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        for(int k=j+1;k<arr.length;k++){
            if(arr[k] != 0){
                swap(arr,k,j);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,3};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
