package String;

import java.util.Stack;

public class validparanthesis {
    static  boolean check(String s)
    {
        int n= s.length();

        while(true)
        {
            if(s.contains("[]"))
            {
                s=s.replace("[]","");
            } else if (s.contains("()")) {
                s=s.replace("()","");

            } else if (s.contains("{}")) {
                s=s.replace("{}","");;

            }else{
                return s.isEmpty();
            }
        }

    }
    public static void main(String[] args) {
        String s="()[";

        System.out.println(check(s));
    }
}
