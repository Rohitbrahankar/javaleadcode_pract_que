package dailyque;

import com.sun.jdi.connect.spi.Connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class day16 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,2,1);
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(list);
        int count=0;

        for(int i=0;i< arrayList.size();)
        {
            if(arrayList.get(i)!=arrayList.get(i+1))
            {
                count++;

            }else {
                i++;
            }
        }
        if(count==0|| count==2)
        {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
