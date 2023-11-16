package StriversDSA.patterns;

import java.util.Scanner;

public class second {
    static void print12(int n){
        int space = 2 * (n-1);
        for (int i =1;i<=n;i++){
            // numbers
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            // spaces
            for (int j=0;j<space;j++){
                System.out.print(" ");
            }
            // numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.print("\n");
            space -= 2;
        }
    }
    static void print13(int n){
        int i = 1;
        for(int j =1;j<=n;j++){
            for(int k=1;k<=j;k++){
                System.out.print(i+" ");
                i+=1;
            }
            System.out.print("\n");
        }
    }
    static void print14(int n){
        for(int j =1;j<=n;j++){
            for(char k='A';k<='A'+j;k++){
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }
    }
    static void print15(int n){
        for(int i=n;i>=0;i--){
            for(char j = 'A';j < 'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    static void print16(int n){
        for(int i=0;i<n;i++){
            char start = (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
            }
            System.out.print("\n");
        }
    }
    static void print17(int n){
        for(int i=1;i<=n;i++) {
            // spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (i/2)+1;
            for(int k=1;k<=2*i-1;k++){
                System.out.println(ch);
                ch++;
            }
            for (int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*print12(n);*/
        /*print13(n);*/
        /*print14(n);*/
        /*print15(5);*/
        /*print16(5);*/
        print17(n);
    }
}