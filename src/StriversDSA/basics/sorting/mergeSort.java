package StriversDSA.basics.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    // merge two arrays
    static void merge(int[] arr,int l,int m,int r){
        int n1 = (m-l)+1;
        int n2 = (r-m);

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j] = arr[m+j+1];
        }

        int i=0,j=0,k=l;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    // merge sort
    static void mergeSort(int[] arr,int low,int high){
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,6};
        mergeSort(arr,0,8);
        System.out.println(Arrays.toString(arr));
    }
}
