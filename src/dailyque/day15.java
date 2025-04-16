//package dailyque;
//
//public class day15 {
//    static  void swap(char a,char b)
//    {
//        char temp=a;
//        a=b;
//        b=temp;
//
//    }
//    public static void main(String[] args) {
//        String s="100";
//        char ch[]=s.toCharArray();
//        int n= ch.length;
//        int count=0;
//        int i=0,j=n-1;
//
//       while(i < j)
//       {
//           if(ch[i]=='0' ){
//               i++;
//           }
//           if(ch[j]=='1')
//           {
//               j--;
//           }
////           if(ch[i]=='1' && ch[j]=='0')
////           {
////               swap(ch[i],ch[j]);
////               count++;
////               i++;
////               j--;
////           }else {
////               if(ch[i]=='1'&&ch[i+1]=='0')
////               {
////                   swap(ch[i],ch[i+1]);
////
////                   count++;
////                   i++;
////               }
////           }
//           if(ch[i]=='1'&&ch[i+1]=='0')
//           {
//               swap(ch[i],ch[i+1]);
//               count++;
//               i++;
//
//           }
//
//       }
//       System.out.println("total swap is :"+count);
//    }
//}
//
package dailyque;

public class day15 {
    // Swap function that modifies the array directly
    static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        String s = "101";
        char[] ch = s.toCharArray();  // Convert string to char array
        int n = ch.length;
        int count = 0;
        int i = 0, j = n - 1;

        while (i < j) {
            if (ch[i] == '0') {
                i++;
            } else if (ch[j] == '1') {
                j--;
            } else if (ch[i] == '1' && ch[i + 1] == '0') {
                // Perform swap on adjacent '1' and '0'
                swap(ch, i, i + 1);
                count++;
                i++;
            }
        }
        System.out.println("Total swaps: " + count);
    }
}
