package javapract;

public class copyarray {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9,10,22,15,46,32,81};
      int copyto[]=new int[10];
      System.arraycopy(arr,1,copyto,0,10);//method to copy the array
       // System.arraycopy(arrname,start_from,copyto,startindex ,endindex);
      for(int i=0;i<10;i++)//print the array
      {
          System.out.println(copyto[i]);
      }

    }
}
