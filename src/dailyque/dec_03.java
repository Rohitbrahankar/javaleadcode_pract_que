package dailyque;

public class dec_03 {
    public static void main(String[] args) {
        String s="spacing";
        int spaces[]= {0,1,2,3,4,5,6};
        int m= spaces.length;
        String ans="";
        int j =0;
        char sarr[]= s.toCharArray();
         for(int i =0;i<s.length();i++)
         {
              if(j < m && i==spaces[j] )
              {
                  ans=ans+" ";
                  j++;
              }
              ans=ans+sarr[i];

         }
        System.out.println( ans);
    }
}
