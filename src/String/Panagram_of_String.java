package String;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Panagram_of_String {
    private  static  boolean fingpanagaram(String s)
    {
        int n= s.length();
       // HashSet<Character>set= new HashSet<>();
        int count=0;

//        for(int i=0; i<n; i++)
//        {
//            char ch= s.charAt(i);
//            if(ch>='a'&& ch<='z')
//            {
//               // set.add(ch);
//                count++;
//            }
//        }
//        //if(set.size()!=26)return  false;
//        if(count!=26)return  false;
//        return  true;
        int arr[]= new int[26];

        int index=0;
        for(char ch:s.toCharArray())
        {
            index= ch-'a';
            arr[index]++;
        }
        for(int i:arr)
        {
            if(i==0)
            {
                return false;
            }
        }
        return  true;

    }
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";

        System.out.println(fingpanagaram(s));


    }
}
