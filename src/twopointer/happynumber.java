package twopointer;

public class happynumber {
    public static void main(String[] args) {
        int n = 2;

       while (n!=1 && n !=4 )
       {
           n= happynumbers(n);
           System.out.println(n);

       }
       if(n==1)
       {
           System.out.println("its happy");
       }
       else  {
           System.out.println("its not happy");
       }



    }
    public  static int happynumbers(int num)
    {
        int sum=0;
        while(num>0)
        {
            int dig= num %10;
            sum+=dig*dig;
            num= num/10;

        }

        return sum;
    }
}
