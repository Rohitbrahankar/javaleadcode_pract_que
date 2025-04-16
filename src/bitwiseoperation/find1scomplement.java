package bitwiseoperation;

import java.util.Arrays;

public class find1scomplement {
    private static String find_binary(int n)
    {
        String rem ="";
        while(n>0) {
            if (n % 2 == 1) {
                rem += '1';
            } else {
                rem += '0';
            }
            n= n/2;


        }

        String nstr = "";
        for (int i = rem.length() - 1; i >= 0; i--) {
            nstr += rem.charAt(i);
        }
       // System.out.println(nstr);
        return nstr;

    }
    public static void main(String[] args) {
        int n=13;
     String num= find_binary(n );
        System.out.println("binary "+num);
     char ans[]=num.toCharArray();

     int m= ans.length;
        for (int i = 0; i < m; i++) {
            if (ans[i] == '1') {
                ans[i] = '0';
            } else {
                ans[i] = '1';
            }
            



        }
        ans.toString();
        System.out.println(ans);

    }


}

