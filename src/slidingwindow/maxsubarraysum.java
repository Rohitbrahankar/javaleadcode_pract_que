package slidingwindow;
//variable size window
public class maxsubarraysum {
    public static void main(String[] args) {
        int arr[]={4,1,1,1,2,3,5};
        int k=5;
        int n= arr.length;
        int i=0,j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(j<n)
        {
            sum+=arr[j];
            if(sum==k )
            {
               max=Math.max(max,j-i+1);

            }
            while(sum>k)
                {
                    sum-=arr[i];
                    i++;
                }

j++;


        }
        System.out.println("max is :"+max);
    }
}
