package Allque;

public class splitstring {
    private static int ckeckString(String s)
    {
       int n= s.length();
        int num= Integer.parseInt(s);
        if(num %2!=0)
        {
            return num;
        }

        int temp = num;
        int larger =-1;
       for(int i =0 ;i<n;i++){
           int m= temp%10;
           temp=temp/10;
           if(m % 2!=0)
           {
               if(larger<m)
               {
                   larger= m;
               }

           }

       }

        return larger;
    }
    public static void main(String[] args) {
        String  s="4206";


      int num=  ckeckString(s);
      if(num==-1)
      {
          System.out.println("");

      }
      String n= ""+num;
        System.out.println(n);
      if( n.equals(0)){

        }


    }
}
