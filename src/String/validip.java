package String;

import java.util.Stack;

public class validip {
    public static void main(String[] args) {
        String  s= "0.0.0.255";
        Stack<Character> st= new Stack<>();
        char arr[]= s.toCharArray();
        int n = arr.length;
        int count=0;
        for(int i =0;i< n;i++)
        {
             if(count==3){
                 count=0;
             }

             if( !st.isEmpty() && st.peek()=='.')
             {
                 System.out.println("not valid");
                 return;
             }
             st.push(arr[i]);



        }
        System.out.println("valid");
        return;

    }
}
commit