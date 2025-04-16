package String;

import java.util.Stack;

public class validip {
    public static void main(String[] args) {
        String  s= "0.0.0.255";
        String[] parts = s.split("\\."); //['222','111','111','111']

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
           
            if (part.length() == 0 || part.length() > 3){
                System.out.println("False");
                    return ;
            }

           
            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    System.out.println("False");
                    return ;
                }
            }

            int num = Integer.parseInt(part);

         
            if (num < 0 || num > 255) {


                System.out.println("False");
                    return ;
            }

           // check no leading 0 
            if (part.length() > 1 && part.charAt(0) == '0')
            {
               System.out.println("False");
                    return ;
            }
        }

      //  return true;
        System.out.println("valid");
        return;

    }
}
commit
