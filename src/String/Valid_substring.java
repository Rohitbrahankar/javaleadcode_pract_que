package String;

import java.util.Stack;

public class Valid_substring {
    public static void main(String[] args) {
        String s="(()())";

        int n = s.length();
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i =0;i< n ;i++)
        {
             if(s.charAt(i)=='(')
             {
                 st.push(s.charAt(i));
             } else if(s.charAt(i)==')')
             {

                  if(!st.isEmpty() && st.peek()=='(')
                   {
                       count+= 2;
                        st.pop();
                   }

             }else{
                 st.push(s.charAt(i));
             }
        }

        System.out.println(count);
    }
}
