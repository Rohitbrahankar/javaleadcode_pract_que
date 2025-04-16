package String;

public class StringRoated {
    public static void main(String[] args) {
        String  s1="amazon";
        String s2="azonam";
        int k =2;
        char arr[]= s1.toCharArray();
        int m = arr.length;

        int n = k/m;
        String ans="";
        for(int i=2;i<m;i++)//right roation
        {
            ans+=arr[i];
        }
        for(int i=0;i< 2;i++)
        {
            ans+=arr[i];
        }
        System.out.println(ans);
        ans="";

        //left roation

        for (int i = m - 2; i < m; i++) {
            ans += arr[i];
        }
        for(int i =0;i<m-2;i++)
        {
            ans+=arr[i];
        }
        System.out.println("clock wise : "+ans);
    }
}
