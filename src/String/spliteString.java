package String;

public class spliteString {
    public static void main(String[] args) {
        String s = "this problem is an easy problem";
        String search="pro";
         for(String val : s.split(" "))
         {
              String val1= val;
             System.out.print(val1);
             if(val1.contains(search))
             {
                 System.out.println(val+" true ");
                 System.out.println(s.startsWith(val));
                 break;
                 //break;
             }
         }

        
    }
}
