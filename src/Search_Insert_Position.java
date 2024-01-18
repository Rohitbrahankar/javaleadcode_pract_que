public class Search_Insert_Position {
    public static void main(String[] args) {

        int target = 7;
        int count = 0;
        int[] arr = {1, 3, 5, 6};
        int start=0;
        int end = arr.length -1;

        while(start>end)
        {  int mid= (start+end)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
            } else if ((arr[mid] < target)) {
                //
                start=mid+1;

            }else
                end=mid-1;

        }
        System.out.println(start);

            }
        }

