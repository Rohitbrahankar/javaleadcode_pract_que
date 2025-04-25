package String;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class Frequency_of_charater {
    public static Boolean  checkFreq(String  s)
    {
        HashMap<Character , Integer> map= new HashMap<Character ,Integer>();
        for(int i=0;i<s.length();i++)
        {
             map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1);

        }

        

        for(Map.Entry<Character ,Integer> mp : map.entrySet())
                {
                       if(mp.getValue() >  1)
                       {
                           return false;
                       }
                }
        return true;


    }
    public static void main(String[] args) {
        String  s="xyz";
        Boolean ans =checkFreq(s);

        System.out.println(ans);


    }
}
