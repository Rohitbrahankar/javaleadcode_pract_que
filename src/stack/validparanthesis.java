package stack;

import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args) {
        String s= "(*)";
        Stack<Character > st= new Stack<>();
        for(int i =0;i<s.length();i++)
        {
             if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
             {
                 st.push(s.charAt(i));
             }else{
                 if(st.empty())
                 {
                     System.out.println("false");
                     break;
                 }
                  if(st.peek()=='(' && s.charAt(i)==')' ||  st.peek()=='[' && s.charAt(i)==']' ||st.peek()=='{' && s.charAt(i)=='}' )
                  {
                      st.pop();
                  }
             }
        }
        if(st.empty())
        {
            System.out.println("true");
            return;
        }else{
            System.out.println("false");
            return;
        }
    }
}
