package Allque;

public class stringque443 {
    public static void main(String[] args) {
        String[] chars ={"a","a","b","b","c","c","c"};
        int n = chars.length;;

        int index=0,i=0;
        while(i<n)
        {
           String curr_char=chars[i];
            int count=0;
            while(i<n && chars[i]==curr_char)
            {
                count++;
                i++;
            }
            chars[index]=curr_char;
             index++;


            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index] = String.valueOf(c);
                    index++;
                }
            }



        }
        System.out.println(index);
    }
}
