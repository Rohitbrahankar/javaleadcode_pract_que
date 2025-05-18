package Array;

public class maxsubarraysum {


    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        int sum=arr[0];
        int maxel=arr[0];
        int n = arr.length;
        for(int i =1;i< n;i++)
        {
            sum+=arr[i];



             maxel=Math.max(maxel , sum);

            if(sum < 0)sum=0;


        }

        System.out.println(maxel);
    }
}

