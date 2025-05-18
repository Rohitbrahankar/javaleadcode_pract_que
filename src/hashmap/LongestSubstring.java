package hashmap;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "aabaaab";
        int k = 2;
        int maxlen = -1;
        HashSet<Character> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int n = s.length();
        while (j < n) {
           if(!set.contains(s.charAt(j)))
           {
               set.add(s.charAt(j));

           }

           if(set.size() >= k )
           {
              maxlen = Math.max(maxlen , j-i+1);

              set.remove(s.charAt(i));
              i++;
           }
            j++;
        }

        System.out.println("maxlength is :"+maxlen);
    }
}
