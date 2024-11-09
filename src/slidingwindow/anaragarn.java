package slidingwindow;
public class anaragarn{
    public static void main(String[] args) {
        String s = "forxxabcorfpqrrof";
        String find = "for";
        int count = 0, i = 0, j = 0;


        int[] findFreq = new int[26];
        int[] windowFreq = new int[26];


        for (char ch : find.toCharArray()) {
            findFreq[ch - 'a']++;
        }


        while (j < s.length()) {

            windowFreq[s.charAt(j) - 'a']++;


            if (j - i + 1 == find.length()) {

                boolean isAnagram = true;
                for (int k = 0; k < 26; k++) {
                    if (findFreq[k] != windowFreq[k]) {
                        isAnagram = false;
                        break;
                    }
                }


                if (isAnagram) {
                    count++;
                }


                windowFreq[s.charAt(i) - 'a']--;
                i++;
            }

            j++;
        }

        System.out.println(count);
    }
}
