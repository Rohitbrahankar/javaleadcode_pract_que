package recursion;

import java.util.Scanner;

public class gcd {
    public static  int gcd(int x,int y)
    {
        if(y==0)
            return x;

        return  gcd(y,x%y);//euclid algo
    }
    public  static  int   igcd(int x,int y)
    {
         while (x %y!=0)
         {
             int  rem= x % y;
             x= y;
             y= rem;
         }
         return  y;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int x = sc.nextInt();
         int y= sc.nextInt();
        System.out.println(gcd(x,y));
        System.out.println(igcd(x,y));
    }
}
