package StriversDSA.problem_solving;

import java.util.Arrays;

public class anagram
{
    static void anagram(String s,String t){
        if (s.length() != t.length()) System.out.println(false);
        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());

        System.out.println(s);
        System.out.println(t);
    }
    public static void main(String[] args) {
        String s = "sourabh";
        Arrays.sort(s.toCharArray());
        System.out.println(s);
    }
}
