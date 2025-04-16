package backtracking;

public class count_no_of_way_Nqueen_place {
    public  static  boolean isSafe(char arr[][] ,int row ,int col)
    {
        for(int i =row-1;i>=0;i--)
        {
            if(arr[i][col]=='Q')
            {
                return  false;
            }
        }
        for(int i =row-1, j =col-1 ; i>=0 && j >=0;j-- ,i--)
        {
            if(arr[i][j]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1 ,j=col+1 ; i>=0 && j< arr.length ;i-- ,j++)
        {
            if(arr[i][j]=='Q')
            {
                return false;
            }
        }
        return  true;
    }
    public static  void printboard(char[][]arr)
    {
        for(int i =0;i< arr.length;i++)
        {
            for(int j =0;j< arr.length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
    public  static  void  Nqueen(char arr[][],int row)
    {
        if(row==arr.length)
        {
            //printboard
            count++;

            return;
        }
        for(int j=0;j< arr.length;j++)
        {
           if(isSafe(arr,row,j))
           {
               arr[row][j]='Q';
               Nqueen(arr,row+1);
               arr[row][j]='.';
           }

        }
    }
    static  int count=0;
    public static void main(String[] args) {
        int n =4;
        char arr[][]= new char[n][n];
        for(int i =0;i< arr.length;i++)
        {
            for(int j =0;j< arr.length;j++)
            {
                arr[i][j]='.';
            }
        }
        Nqueen(arr, 0);
        System.out.println("total number of queens "+count);
    }
}
