package Allque;

import java.util.ArrayList;

public class sortarrbynigative {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, 1},
                {3, 2, 1, 1},
                {1, 1, 1, 2},
                {1, 1, 2, 3}
        };
        int row= grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        ArrayList<Integer> al= new ArrayList<>();
        System.out.println("total negative is :"+count);

    }
}
