package dailyque;

public class day5 {
    public static String[] splitWords(String s) {
        return s.split(" "); // Splitting by words, not characters
    }

    public static boolean check() {
        String s1 =  "Luky";
        String s2 = "Luccky";

        String[] word1 = splitWords(s1);
        String[] word2 = splitWords(s2);

        if (word1.length < word2.length) {
            // Ensure word1 is always longer
            String[] temp = word1;
            word1 = word2;
            word2 = temp;
        }

        int n = word1.length;
        int m = word2.length;
        int start = 0;
        int end = n - 1;
        int w2start = 0;
        int w2end = m - 1;

        // Check if word2 is a subsequence from start or end of word1
        while (start <= end && w2start <= w2end) {
            if (word1[start].equals(word2[w2start])) {
                start++;
                w2start++;
            } else if (word1[end].equals(word2[w2end])) {
                end--;
                w2end--;
            } else {
                break; // No match, break out of loop
            }
        }

        // If we matched all words in word2
        return (w2start > w2end);
    }

    public static void main(String[] args) {
        System.out.println(check()); // Output: true
    }
}
