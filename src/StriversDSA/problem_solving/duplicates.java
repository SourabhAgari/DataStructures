package StriversDSA.problem_solving;

import java.util.HashSet;
import java.util.Set;

public class duplicates {
    /*
    Brute Force Solution
    static boolean dupsExists(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) return true;
            }
        }
        return false;
    }*/

    static boolean dupsExists(int[] arrs){
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int arr: arrs){
            if (hashSet.contains(arr)){
                return  true;
            }
            else hashSet.add(arr);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(dupsExists(arr));

    }
}
