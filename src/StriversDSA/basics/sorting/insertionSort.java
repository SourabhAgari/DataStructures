package StriversDSA.basics.sorting;

import java.util.Arrays;

public class insertionSort {
    static void insertionSort(int[] arr,int start,int end){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                selectionSort.swap(arr,j-1,j);
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        insertionSort(arr,0, arr.length);
    }
}
