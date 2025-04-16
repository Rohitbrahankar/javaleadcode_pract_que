package dailyque;

import java.util.Stack;

public class day7 {
    public static void main(String[] args) {
        String st="[]";
        int n= st.length();
       // Stack<Character> stack = new Stack<>();
        int count=0;
        for(char ch : st.toCharArray())
        {
            if(ch=='['){
                //stack.push(ch);
                count++;
            }else if(count>0)
            {
                count--;
            }
        }
        System.out.println((count+1)/2);

    }

}
