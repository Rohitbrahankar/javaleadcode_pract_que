package dailyque;

import java.util.Arrays;

public class day3 {
    public static void main(String[] args) {
        int skill[] = {1,1,2,3};
        Arrays.sort(skill);
        int n = skill.length ;
        int i = 0;
        int j = n - 1;
        int sum=skill[i]+skill[j];

        long chem = 0;
        while(i<j)
        {
           int curre_sum=skill[i]+skill[j];

            if(curre_sum!=sum)
            {
                System.out.println("not equal");
               break;
            }
            chem+=skill[i]*skill[j];

            i++;j--;


        }
    
        System.out.println(chem);

    }
}
