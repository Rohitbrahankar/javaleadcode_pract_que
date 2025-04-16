package backtracking;

public class N_quens{
    public static boolean issafe(Character arr[][], int row, int col) {
        // Check vertically above
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
       //check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void N_quens(Character arr[][], int row) {
        if (row == arr.length) {
            printbord(arr);
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if (issafe(arr, row, j)) {
                arr[row][j] = 'Q';
                N_quens(arr, row + 1);
                arr[row][j] = '*';
            }
        }
    }

    public static void printbord(Character arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        int n = 4;
        Character arr[][] = new Character[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '*';
            }
        }
        N_quens(arr, 0);
    }
}
