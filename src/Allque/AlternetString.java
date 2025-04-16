package Allque;

public class AlternetString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;
        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                sb.append(s1.charAt(i));
                i++;
            }
            if (j < s2.length()) {
                sb.append(s2.charAt(j));
                j++;
            }
        }
        System.out.println(sb);
    }
}
