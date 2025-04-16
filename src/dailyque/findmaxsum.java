package dailyque;

public class findmaxsum {
    public static void main(String[] args) {
        int arr[]={10, 20, 30};
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        for(int i:arr)
        {
            if(i!=max && i>secmax)
            {
                secmax=i;
            }
        }
        System.out.println("first max="+max);
        System.out.println("second max="+secmax);
        System.out.println(max+secmax);
    }
}

