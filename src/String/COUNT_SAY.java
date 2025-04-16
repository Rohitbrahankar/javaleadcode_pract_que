package String;

public class COUNT_SAY {
    public static   String countsay(int n)
    {
       if(n==1) return "1";
       String say= countsay(n-1);
       String result="";
       for(int i =0;i<say.length();i++)
       {
           char ch= say.charAt(i);
           int count=1;
           while(i < say.length()-1 &&say.charAt(i)==say.charAt(i+1))
           {
               count++;
               i++;
           }
           result +=String.valueOf(count)+String.valueOf(ch);
       }
        return result;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(countsay(n));

    }
}
