package slidingwindow;
//maximum subarray sum
public class maxsum {
    public static void main(String[] args) {
        int Arr[] = {100, 200, 300, 400};
        int n=Arr.length;
        int k=2;//denote window size
        int s=0;
        int e=0;
        int sum=0;
        int max= Integer.MIN_VALUE;;
        while(e<n)
        {

                sum +=Arr[e];

             if(e-s+1==k)
            {
                max= Math.max(max,sum);
                sum -=Arr[s];
                s++;

            }
            e++;
        }
       //
        System.out.println("Max sum is :"+max);


    }
}
