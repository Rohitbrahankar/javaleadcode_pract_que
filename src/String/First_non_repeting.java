package String;

public class First_non_repeting {
    public static void main(String[] args) {
        String given ="geeksforgeeks ";

        int arr[]= new int [26];


        for(char c : given.toCharArray())
        {   if(c >= 'a' && c <= 'z')
              arr[c - 'a']++;
        }

        for(char c : given.toCharArray())
        {
             if(c >= 'a' && c <= 'z'   &&  arr[ c - 'a'] == 1)
             {
                 System.out.println("first non repeting :"+c);
                 return;
             }
        }
//        int count=0;
//        for(int i =0 ;i< n;i++)
//        {
//             for(int j=0;j< n;j++)
//             {
//                 if(given.charAt(i) == given.charAt(j))
//                 {
//                     count++;
//                 }
//             }
//             if(count ==1)
//             {
//                 System.out.println(given.charAt(i));
//                 return;
//             }
//             count=0;
//        }

        System.out.println("$");

    }
}
