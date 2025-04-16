package bitwiseoperation;

public class findunique {
    public static void main(String[] args) {
        int n[]={2,2,3,2};
        int unique=0;
        for(int i:n)
        {
            unique ^=  i;

        }
        System.out.println(unique);
    }
}
