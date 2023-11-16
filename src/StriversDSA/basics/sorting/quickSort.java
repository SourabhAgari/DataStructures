package StriversDSA.basics.sorting;

import java.util.Arrays;

public class quickSort {
    static int placePivot(int[] arr,int low,int high){
        int pivot = low;
        int i =low;
        int j = high;
        while (i < j){
            while (arr[i] <= arr[pivot]){
                i++;
            }
            while (arr[j] > arr[pivot]){
                j--;
            }
            if(i<j) {
                selectionSort.swap(arr,i,j);
            }
        }
        selectionSort.swap(arr,pivot,j);
        return j;
    }
    static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int partionIndex = placePivot(arr,low,high);
            quickSort(arr,low,partionIndex-1);
            quickSort(arr,partionIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSort(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }
}
