public class ReverseArray {

    public static int[] abc() {
        int arr[] = {10, 20, 30, 40, 5, 6};

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
//System.out.println(arr[i]);
            }


        }

        return arr;
    }

        public static void main(String[] args){

           int x[]= abc();
            System.out.println(x);

        }
}