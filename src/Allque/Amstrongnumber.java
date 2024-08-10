package Allque;

import static java.lang.Math.pow;

public class Amstrongnumber {
    static  void amstrong(int num)
    {
        int temp= num;
        int ans=0;
        int len= String.valueOf(num).length();
        while(temp !=0)
        {
            int n = temp %10;
            temp=temp/10;

            ans= (int) (ans+ pow(n, len));


        }
       // System.out.println(ans);
        if(ans == num)
        {
            System.out.println("A");
        }
        else System.out.println("nukal");
    }
    public static void main(String[] args) {
        amstrong(1634);
    }
}
