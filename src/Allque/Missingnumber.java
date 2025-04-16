package Allque;

public class Missingnumber {
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        int arr[] = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            arr[nums[i]] = 1;
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <=n; i++) {
//            if (arr[i] == 0) {
//                System.out.println("miss" + i);
//                break;
//            }
//
//
//        }
        int res=n;
        for(int i =0 ; i<n;i++)
        {
            res+=i-nums[i];
        }

        System.out.println("miss"+res);


    }

//        int res = nums.length;
//
//        for(int i = 0; i < nums.length; i++) {
//            res += i - nums[i];
//        }


    }


