package recursion;

import java.util.SortedMap;

public class Stringpalindrom {
//   static boolean plindrom(int i,String s,int n)
//   {
//
//       if(i >= n/2) return  true;
//       if(s.charAt(i) != s.charAt(n-1)) {
//           return  false;
//       }
//         return   plindrom(i+1,s,n-1);
//   }
static boolean plindrom(int i,String s,int n)
{

    if(i >= n) return  true;
    if(s.charAt(i) != s.charAt(n-1)) {
        return  false;
    }
    return   plindrom(i+1,s,n-1);
}
    public static void main(String[] args) {
        String s="";
        String snew= s.replaceAll("[, :]", "");
        snew= snew.toLowerCase();
        System.out.println("before reverse "+snew);
        int n = snew.length();
        System.out.println(plindrom(0,snew,n));
    }
}
