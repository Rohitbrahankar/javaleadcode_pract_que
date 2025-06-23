package Array;

public class sum_of_digit_sum_is_singledig {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        while(n!=0)
        {
            sum+=n%10 ;
            n= n/10;
        }
        System.out.println(sum);

        while(sum > 9)
        {
            int rem= sum %10 ;
            sum= sum /10 ;
            sum= sum+rem;
        }
        System.out.println(sum);
    }
}
