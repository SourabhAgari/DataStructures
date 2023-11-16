package StriversDSA.basics.sorting;

import java.util.Arrays;

// pick up the max and swap it with the next adjacent element
public class bubbleSort {

    static void bubbleSort(int[] arr,int start,int end){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    selectionSort.swap(arr,j,j+1);
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr,0,arr.length);
    }
}
