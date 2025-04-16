package dailyque;

public class find_power_k_smallest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,5};
        int k =3;
        int n = arr.length;
        int i=0,j=0;
        int ans[]= new int[n-k+1];
        int m=0;
        int max=arr[j];
        while(j < n)
        {


            if(arr[i]<arr[j])
            {
                 max= Math.max(max,arr[j]);
                j++;
            }else{
                ans[m]=-1;
                j++;
            }
            if(j-i+1==k)
            {
                ans[m]=max;
                m++;
                i++;
            }


        }
        for(int p=0;p<ans.length;p++)
        {
            System.out.println(ans[p]);
        }
    }
}
