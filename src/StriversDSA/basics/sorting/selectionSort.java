package StriversDSA.basics.sorting;

import java.util.Arrays;

public class selectionSort {

    // swaps the two elements from an array
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // selection sort - pick the minimum and then swap
    static void selectionSort(int[] arr,int start,int end){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i;j<arr.length;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selectionSort(arr,0, arr.length);
    }
}
