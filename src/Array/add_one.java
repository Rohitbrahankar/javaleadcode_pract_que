package Array;

public class add_one {
    public static void main(String[] args) {
        int arr[]={9 ,9 ,9};
        int num=0;
        int ans=0;
        int n = arr.length;

//        for(int i : arr)
//        {
//             num= num*10+i;
//        }
//        ans = num+1;
//        System.out.println(ans);

        for(int i = n -1; i >=0 ;i--)
        {
            if(arr[i] < 9)
            {
                 arr[i]++;
                break;

            }
            arr[i]=0;
        }

        int newnumber[]= new int[n+1];
        newnumber[0]=1;


        for(int i : arr)
        {
            System.out.println(i);
        }
        for(int i : newnumber)
        {
            System.out.println(i);
        }

    }
}
