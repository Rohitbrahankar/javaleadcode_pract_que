package Greedy.Top50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    public static void main(String[] args) {
        int dedline[]={4, 1, 1, 1};
        int profit[]={20, 10, 40, 30};

        int time=0;
        int n = dedline.length;
        int job [][]= new int[n][2];

        for(int i =0;i< n;i++)
        {
            job[i][0]=dedline[i];
            job[i][1]=profit[i];
        }

        Arrays.sort(job,(job1,job2)->job2[1] - job1[1]);
        ArrayList<Integer> ans= new ArrayList<>();

        int maxprofit=0;
        for(int i =0;i< n ;i++)
        {
            if(job[i][0] < time)
            {
                ans.add(job[i][0]);
                maxprofit += job[i][1];
                time++;

            }


        }
        ans.add(maxprofit);

        System.out.println("elements are :"+ ans);
    }
}
