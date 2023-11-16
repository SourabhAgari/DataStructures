package StriversDSA.basics.basicmaths;


import java.util.*;

// digits extraction from an integer number
public class digits {
    static void displaydigits(int n){
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            count +=1;
            n = n /10;
        }
        System.out.println("Counts of the digit is :"+count);
    }
    static int reverseDigits(int n){
        int reverse = 0;
        while (n > 0){
            int lastDigit = n % 10;
            n = n/10;
            reverse = (reverse * 10) + lastDigit;
        }
        return reverse;
    }
    static Boolean palindrome(int n){
        if(n == reverseDigits(n)){
            return  true;
        }
        else return  false;
    }
    static Boolean armstrong(int n){
        int sum =  0;
        while (n>0){
            int lastDigit = n %  10;
            sum += (lastDigit*lastDigit*lastDigit);
            n = n /  10;
        }
        if(n==(int) sum){
            return true;
        }
        return false;
    }
    static ArrayList<Integer> printDivisors(int n){
        /*while (i <= n){
            if((n%i)==0){
                System.out.println(i);
            }
            i++;
        }*/
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for(int i = 1; i <= Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                if(n/i != i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
    static Boolean checkPrime(int n){
        ArrayList<Integer> divisors = printDivisors(n);
        if(divisors.size()==2){
            return true;
        }
        else return false;
    }
    static int gcd(int n1,int n2) {
        /*
        brute force
        int gcd = 1;
        for (int i =1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;*/

        // Better Solution
        /*while(n1 > 0 && n2 > 0){
            if (n1 > n2){
                n1 = n1 - n2;
            }
            else n2 = n2 - n1;
        }
        if (n1 == 0){
            return n2;
        }
        else return n1;

    }*/
        // Best Solution
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else n2 = n2 % n1;
        }
        if (n1 == 0) {
            return n2;
        }
        else return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1,n2));

    }
}
