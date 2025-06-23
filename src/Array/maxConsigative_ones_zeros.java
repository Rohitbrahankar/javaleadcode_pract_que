package Array;

public class maxConsigative_ones_zeros {
    public static void main(String[] args) {
        int arr[]={0,1,0,1 , 1 ,1  };
        int n = arr.length;
        int ones=0;
        int zero=0;
        int count=0;

        for(int i : arr)
        {
             if(i==0)
             {


                 count=0;
             }else{
                 count++;
                 ones=Math.max(ones , count);
             }

        }
        count=0;
        for(int i : arr)
        {
             if( i ==1)
             {

                 count=0;
             }else{
                 count++;
                 zero=Math.max(zero , count);
             }

        }

        int ans =0;
        ans = Math.max(ans , Math.max(zero , ones));
        System.out.println(ans);
    }
}
