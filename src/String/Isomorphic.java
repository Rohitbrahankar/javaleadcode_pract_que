package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomorphic {
    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);


            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (mappedValues.contains(c2)) return false;
                map.put(c1, c2);
                mappedValues.add(c2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xy";

        System.out.println(isIsomorphic(s1, s2)); // Output: false
    }
}
