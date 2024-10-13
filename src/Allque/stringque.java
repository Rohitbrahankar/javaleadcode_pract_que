package Allque;

import java.util.HashMap;
import java.util.HashSet;

public class stringque {
    public static void main(String[] args) {
        String str1="abcch";
        String str2="abch";
        HashSet<Character> hs1= new HashSet<>();
        for(int i=0;i<str1.length()-1;i++)
        {
            hs1.add(str1.charAt(i));
        }
        HashSet<Character> hs2= new HashSet<>();
        for(int i=0;i<str2.length()-1;i++)
        {
            hs1.add(str2.charAt(i));
        }
        int n= hs1.size();
        int m= hs2.size();
        if(n==m)
        {
            System.out.println("String is isomorphic ");
        }
        else {
            System.out.println("not");
        }
    }
}
