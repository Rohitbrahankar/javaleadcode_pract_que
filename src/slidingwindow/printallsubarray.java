package slidingwindow;


import java.util.ArrayList;
import java.util.List;

public class printallsubarray {
    public static   List<List<Integer>> findsubarray(int arr[],int k)
    {

        List<List<Integer>> result= new ArrayList<>();
        List<Integer>ans= new ArrayList<>();
        int i=0;
        int j=0;

        while(j< arr.length)
        {
            ans.add(arr[j]);
            if(j-i+1 ==k)
            {
                result.add(new ArrayList<>(ans));
                ans.remove(0);

                i++;
            }
            j++;
        }

        return  result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};

        int k =1;
        for(int i =k ;i<= arr.length;i++)
        {

            List<List<Integer>> result1=findsubarray(arr,i);
            System.out.println(result1);

        }


    }
}
