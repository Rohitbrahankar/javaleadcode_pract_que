package Allque;

public class stringtrust {
    public static void main(String[] args) {
        String s="luffy is still joyboy";
        s=s.strip();

        String[] words = s.split(" ");
        int n= words.length;
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(words[i]);
//        }
        int m= words[n-1].length();
        System.out.println("m:"+m);









    }
}
