package String;

import java.util.*;

public class most_frequently {
    public static void main(String[] args) {
        String  s="testsample";
      int fre[]= new int [26];

        for(char i :s.toCharArray())
        {
            fre[i-'a']++;
        }
        char result = 'z';
        int maxfre=0;


       for(char c='a' ;  c <='z';c++)
       {
           if(fre[c-'a'] > maxfre)
           {
               maxfre=fre[c-'a'];
               result=c;
           }
       }
        System.out.println(result);

    }
}
