package StriversDSA.basics.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class recursive {
    static void printNamesN(int i,int n){
        if (i > n) return;
        System.out.println("Sourabh");
        printNamesN(i+1,n);
    }
    static void printNumLinear(int i,int n){
        if (i > n) return;
        System.out.println(i);
        printNumLinear(i+1,n);
    }
    static void printNumLinearReverse(int i,int n){
        if (i <= 0) return;
        System.out.println(i);
        printNumLinearReverse(i-1,n);
    }
    static void printNumLinearB(int i,int n){
        if (i > n) return;
        printNumLinear(i+1,n);
        System.out.println(i);
    }
    static void printNumLinearReverseB(int i,int n){
        if (i <= 0) return;
        printNumLinearReverse(i-1,n);
        System.out.println(i);
    }
    // using parameterised approach
    static void sumRecursion(int i,int sum){
        if (i == 0){
            System.out.println(sum);
            return;
        }
        sumRecursion(i-1,sum+i);
    }
    // using functional recursion
    static int sumRecursionF(int n){
        if (n == 0) return 0;
        return  n+sumRecursionF(n-1);
    }
    static int factorial(int n){
        if (n==1) return 1;
        return n * factorial(n-1);
    }
    static void reverseS(int start,ArrayList<Integer> arr,int length){
        if(start >= length/2){
            return;
        }
        Collections.swap(arr,start,length-start);
        reverseS(start+1,arr,length-1);
        System.out.println(arr);
    }
    static int fibonacci(int n){
        if (n <= 1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(4));
    }
}
