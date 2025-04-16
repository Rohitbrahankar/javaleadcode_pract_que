package hashmap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String , Integer> mp = new HashMap<>();
        mp.put("Abc",123);
        mp.put("pqr",1);
        mp.put("xyz",12);
        mp.put("om",1234);
        mp.put("Ram",1237);
        System.out.println(mp.get("Abc"));
        System.out.println(mp.containsKey("Abc"));
        mp.putIfAbsent("Ab",123);
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
     mp.remove("Abc");
        System.out.println(mp.values());
        System.out.println(mp.keySet());
    }
}
