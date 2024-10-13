package Allque;

import java.util.ArrayList;
import java.util.List;

public class maxlengthofsubstring {
    public static void main(String[] args) {
        String s= "";
        int st=0;
        int end=0;

        List<Character> li= new ArrayList<>();
        if(s.equals("")) System.out.println(1);
        int max_length=0;
        while (end <s.length()-1)
        {
            if(!li.contains(s.charAt(end)))
            {
                li.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,li.size());
            }
            else {
                li.remove(Character .valueOf(s.charAt(st)));
                st++;
            }

        }
        System.out.println("Max length :"+max_length);
    }
}
