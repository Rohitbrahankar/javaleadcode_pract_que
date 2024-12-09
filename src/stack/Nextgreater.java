package stack;

import java.util.Stack;

public class Nextgreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nextgrater[]= new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =arr.length-1;i>=0 ;i--)
        {
            while(!st.empty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                nextgrater[i]=-1;
            }else{
                nextgrater[i]= arr[st.peek()];
            }
            st.push(i);
        }
        for(int i:nextgrater)
        {
            System.out.println(i);
        }
    }
}
