package javapract;

public class copyarray {
    public static void main(String[] args) {

        char arr1[] = {'a', 'b', 'c', 'd', 'f', 'h', 'j', 'k', 'l', 'm', 'n'};//copyfrom
        char[] arr2 = new char[7];

        System.arraycopy(arr1, 1,arr2,0,7);
        System.out.println(String.valueOf(arr2));//converts different types of values into string

        System.out.println(arr2);
    }
}
