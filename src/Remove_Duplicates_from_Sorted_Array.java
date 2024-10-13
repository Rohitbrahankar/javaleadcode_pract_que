import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int n, count = 0;
//
        //int arr[] = new int[n];
        Set<Integer> st = new LinkedHashSet<>();
        int arr []={0,0,1,1,1,2,2,3,3,4};
       // int arr[]={1,1,2};

//        System.out.println("element of an array :");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.next  Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the size of an array :");
////        n = sc.nextInt();Int();
//        }
//        int i,j=1;
//
//        for( i=1;i<n;i++)
//        {
//            if(arr[j]!=arr[i])
//            {
//                arr[j]=arr[i];
//                j++;
//
//            }
//
//        }
//        for(j=0 ;j<n-1;j++)
//        {
//            System.out.println(arr[j]);
//        }
     for(int i=0 ;i< arr.length;i++)
     {
         if(!st.contains(arr[i])){
             st.add(arr[i]);
         }
     }
int k = st.size();
        System.out.println("Size of k is :"+k);
        System.out.println("Elemnet of set :"+st);


    }
}
