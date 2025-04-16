package dailyque;

import javax.swing.plaf.IconUIResource;

public class jan15 {
    public static void main(String[] args) {
        int num1=1;
        int num2=12;
        int count=0;
        String newnum2= Integer.toBinaryString(num2);
        char[] num2arr= newnum2.toCharArray();
        for(char i:num2arr )
        {
            if(i=='1')
            {
                count++;
            }
        }
        String newnum1= Integer.toBinaryString(num1);
        char[] num1arr = newnum1.toCharArray();
        int num1count=0;
        for(int i =0;i< num1arr.length;i++)
        {
            if(newnum1.charAt(i)=='1')
            {
                num1count++;
            }
        }
        System.out.println(count);
        System.out.println(num1count);
        if(count == num1count)
        {
            System.out.println(num1);
            return;
        }else if(num1count < count) {
            int cou=count-num1count;
            int i=0 ,j= num1arr.length;
            while(i < cou)
            {

                if(num1arr[j]=='0')
                {
                    num1arr[j]='1';
                }
                    i++;
                    j--;
            }
            String ans="";
            for(char p:num1arr)
            {
                ans=ans+p;
            }
            System.out.println(ans);

        }else {
            
        }
    }
}
