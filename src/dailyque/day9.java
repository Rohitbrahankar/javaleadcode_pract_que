package dailyque;
//962
public class day9 {
    public static void main(String[] args) {
        int nums[]={9,8,1,0,1,9,4,0,4,1};
        int n= nums.length;
    /*   int max=0;
        int i=0 ,j=i+1;
       while(i<n) {
           for (j=i+1;i<n-1;j++)
           {
               if (nums[i] <= nums[j]) {
                   int dis = j - i;
                   if (max < dis) {
                       max = dis;
                   }

               }


           }
           i++;
       }*/

        int maxright[]= new int[n];
        maxright[n-1]=nums[n-1];

        for( int i =n-2;i>=0;i--)
        {
            maxright[i]=Math.max(maxright[i+1],nums[i]);
        }
        int max=0,i=0,j=0;
        while(j < n)
        {
            while(i < j && nums[i] > maxright[j]){
                i++;
            }
            max=Math.max(max,j-i);
            j++;
        }
        System.out.println(max);



    }
}
