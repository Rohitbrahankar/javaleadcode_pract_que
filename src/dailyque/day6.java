package dailyque;

public class day6 {
    public static void main(String[] args) {
        String s="ACBBD";
        int n=s.length();
        String pattern = "AB|CD";
        String result = s.replaceAll(pattern, "");

        while (!s.equals(result)) {
            s = result;
            result = s.replaceAll(pattern, "");
        }

        System.out.println(result.length());

    }
}
