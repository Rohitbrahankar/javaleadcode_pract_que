package Greedy;//package Greedy;
//
//import java.util.Scanner;
//
//
//
//public class exam2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Reading input
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int K = sc.nextInt();
//
//        int[][] matrix = new int[N][M];
//        int[][] newMatrix = new int[N][M];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                matrix[i][j] = sc.nextInt();
//                newMatrix[i][j] = matrix[i][j]; // clone matrix
//            }
//        }
//
//        int unchangedCount = 0;
//
//        // Precompute row sums and column sums
//        int[] rowSums = new int[N];
//        int[] colSums = new int[M];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                rowSums[i] += matrix[i][j];
//                colSums[j] += matrix[i][j]; // fast lihi
//            }
//        }
//
//        // Process matrix
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if (matrix[i][j] % K == 0) {
//                    int rowAvg = rowSums[i] / M;
//                    int colAvg = colSums[j] / N;
//                    int updatedVal = (rowAvg + colAvg) / 2;
//                    newMatrix[i][j] = updatedVal;
//                } else {
//                    unchangedCount++;
//                }
//            }
//        }
//
//        System.out.println(unchangedCount);
//    }
//}

import java.util.*;

public class MatrixUpdateCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int[][] matrix = new int[N][M];
        int[][] updatedMatrix = new int[N][M];
        int unchangedCount = 0;

        // Read matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Compute updated values
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] % D == 0) {
                    updatedMatrix[i][j] = matrix[i][j];
                    continue;
                }

                int rowSum = 0, colSum = 0;
                for (int x = 0; x < M; x++) rowSum += matrix[i][x];
                for (int y = 0; y < N; y++) colSum += matrix[y][j];

                int count = N + M - 1;
                updatedMatrix[i][j] = (rowSum + colSum - matrix[i][j]) / count;
            }
        }

        // Count unchanged elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == updatedMatrix[i][j]) {
                    unchangedCount++;
                }
            }
        }

        System.out.println(unchangedCount);
        sc.close();
    }
}