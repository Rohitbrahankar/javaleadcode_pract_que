// swap the alternative of number


import java.util.Scanner;

public class swape_the_alternative_number {
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array :");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           if (i+1<n)// use to check the element is presnt
            {
                 int temp = arr[i];
                 arr[i]= arr[i+1];
                 arr[i+1]= temp;
              // j++;

            }
            i++;

        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
