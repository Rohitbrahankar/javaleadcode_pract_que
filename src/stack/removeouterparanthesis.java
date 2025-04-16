package stack;

import java.util.Stack;

public class removeouterparanthesis {
    public static void main(String[] args) {
        String s="()()";
        String ans="";
        StringBuilder st= new StringBuilder();
        int open =0;
        for(char ch : s.toCharArray())
        {
             if(ch=='(')
             {
                  if(open > 0)
                  {
                      st.append(ch);
                  }
                  open++;
             }else{
                  open--;
                  if(open > 0)
                  {
                       st.append(ch);
                  }
             }
        }
        if (ans.length() == 0) {
            System.out.println("\"\"");
        } else {
            System.out.println(ans.toString());
        }


    }
}
