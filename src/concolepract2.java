import java.io.*;
public class concolepract2 {
    public static void main(String[] args)throws Exception{
        Console c = System.console();
        String uname = c.readLine("User Name : ");
        String upwd = new String(c.readPassword("Password : "));
        if(uname.equals("durga") && upwd.equals("durga")){
            System.out.println("Status : Login Succss");
        }else{
            System.out.println("Status : Login Failure");
        }
    }
}
