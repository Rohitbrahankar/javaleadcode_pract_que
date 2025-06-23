package String;

public class substring_sum {
    public static void main(String[] args) {
        String s="421";
        int n = s.length();

        int arr []= new int[n];

        for(int i =0;i<n;i++ )
        {
             arr[i]= s.charAt(i)-'0';

        }

        int totalsum=0;


        for(int i =0;i< n;i++)
        {
            for(int j =i ;j< n;j++)
            {
                String sub = s.substring(i ,  j+1);
                int num = Integer.parseInt(sub);
                totalsum+=num;

             }
        }

        System.out.println(totalsum);
    }
}
