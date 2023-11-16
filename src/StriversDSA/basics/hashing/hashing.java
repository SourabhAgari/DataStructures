package StriversDSA.basics.hashing;

import java.util.HashMap;
import java.util.Scanner;


public class hashing {
    /* Number Hash */
    static void numberHash(Scanner sc){
        int[] mpp = new int[26];
        int[] numbers = {1,2,2,3,2,1,4,4,5};
        for(int i=0;i<numbers.length;i++){
            mpp[numbers[i]]++;
        }
        System.out.println("Query");
        int q = sc.nextInt();
        while(q > 0){
            int n = sc.nextInt();
            System.out.println(mpp[n]);
            q--;
        }
    }

    /* Character Hashing */
    static void characterHashing(Scanner sc){
        String s = sc.next();

        //pre compute
        int[] hash = new int[26];
        for (int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        // query from the user
        int q = sc.nextInt();
        while (q>0){
            char c = sc.next().charAt(0);
            System.out.println(c+" appears "+hash[c-'a']+" times ");
            q--;
        }
    }
    /* HashMap based Hashing, adv : saves space*/
    static void mapHash(Scanner sc){
        int[] number = {1,2,3,4,5,3,1,2};
        // precompute
        HashMap<Long,Long> mpp = new HashMap<Long,Long>();
        for(int i =0;i<number.length;i++){
            long count = number[i];
            mpp.put(count,mpp.getOrDefault(count,0L)+1L);
        }
        // fetch
        System.out.println(mpp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numberHash(sc) ;
    }
}
