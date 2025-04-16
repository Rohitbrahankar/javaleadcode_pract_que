package dailyque;

import java.util.Arrays;

public class daytwoNov {
    public static void main(String[] args) {
        String s="leetcode";
       int i = 0;
       int n= s.length();
       for( i=0;i<s.length();i++)
       {
           if(s.charAt(i)!=s.charAt(n-1)) {
               return;
           }else if (s.charAt(i) == ' ') {
                   boolean b = s.charAt(i - 1) == s.charAt(i + 1);
                   if (b == false) {
                       return;

                   }
               }

       }
        System.out.println("is circular");


    }
}
