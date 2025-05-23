package dailyque;
/*1861. Rotating the Box*/
public class day23 {

}
class Solution {
    private void fill(char[][] res, int count, int x, int y) {
        while (count > 0) {
            res[x][y] = '#';
            x--;
            count--;
        }
    }

    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] res = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = '.';
            }
        }

        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (box[i][j] == '#') {
                    count++;
                } else if (box[i][j] == '*') {
                    res[j][m - i - 1] = '*';
                    fill(res, count, j - 1, m - i - 1);
                    count = 0;

                }
            }
            if (count > 0) {
                fill(res, count, n - 1, m - i - 1);
            }
        }
        return res;

    }
}