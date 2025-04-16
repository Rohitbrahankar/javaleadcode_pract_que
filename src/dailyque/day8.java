package dailyque;

public class day8 {
    public static void main(String[] args) {
        String  st= "()))(";
        int open=0;
        int close=0;
        int ans=0;
        for(int i=0;i<st.length();i++) {
            if (st.charAt(i) == '(' )
            {
               open++;
            }
            else if (st.charAt(i) == ')' )
            {
                   if(open >0)
                   {
                       open--;
                   }
                   else
                   {

                       close++;
                   }


            }


        }
        ans= open+close;
        System.out.println(ans);
//        if(open > close)
//        {
//            ans= open-close;
//            System.out.println("ans :"+ans);
//        }else if(close > open){
//            ans= close-open;
//            System.out.println("1 :"+ans);
//        }else  {
//            System.out.println(ans);
//        }
       // System.out.println("ans:"+open);
    }
}
