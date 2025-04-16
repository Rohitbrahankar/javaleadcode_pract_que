package String;

import java.security.cert.X509Certificate;
import java.util.Scanner;

public class replacecharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String [] word= s.split(" ");
        StringBuilder sb = new StringBuilder();
        if(!s.equals(s.toUpperCase()))
        {
            System.out.println(s);
            return;
        }

        for(int i =0;i< word.length;i++)
        {
            if(!word[i].isEmpty() ) {


               {
                    char ch = word[i].charAt(0);
                    char newch = Character.toUpperCase(ch);
                    String ans = newch + word[i].substring(1);
                    sb.append(ans).append(" ");
                }

            }
        }
        String result=sb.toString().trim();
        System.out.println(result);

    }
}
