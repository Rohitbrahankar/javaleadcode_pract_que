package Array;

public class Majorityele {
    public static void main(String[] args) {
        int arr[]= {2};

        int maxcount=0;
        int count=0;
        int ans =-1;
        int n = arr.length;
        if(n==1)
        {
            System.out.println(arr[0]);
            return;
        }

        for(int i =0;i< n;i++)
        {
             for(int j =i;j<n ;j++)
             {
                  if(arr[i]==arr[j])
                  {
                      count++;
                  }
             }
             if(count > maxcount)
             {
                 maxcount=count;

             }
            if(maxcount > (n/2))
            {
                System.out.println(arr[i]);
                return ;
            }
             count=0;


        }

        System.out.println(ans);
    }
}
