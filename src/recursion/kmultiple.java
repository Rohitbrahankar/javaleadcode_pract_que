package recursion;


import java.util.Scanner;

public class kmultiple {
    public static void  kmultiple(int n,int k)
    {
       if(k==1)
       {
           System.out.println(n);
           return;

       }
       kmultiple(n,k-1);
        System.out.println(n*k);



    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,k;
        System.out.println("Enter the number :");
        n= sc.nextInt();
        System.out.println("Enter how many number to be print :");
        k= sc.nextInt();
        kmultiple(n,k);



    }
}
