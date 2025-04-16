package dailyque;

public class day4 {
    public static void main(String[] args) {
        String s1="ab";
        String s2="ab";
        String nstr = "";
        char  ch;
        if(s1.equals(s2))  return;
        

        for(int i=0;i<s1.length();i++)
        {
            //int j=s1.length()-1;
           ch= s1.charAt(i); //extracts each character
             nstr= ch + nstr;

        }
       // System.out.println(nstr);
        if (s2.contains(nstr)) {
            System.out.println("yes");
        } else {
            System.out.println("str1 does not contain str2");
        }


    }
}
