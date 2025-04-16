package Greedy;

import java.util.Scanner;

public class exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt(); // Alex's points
        int p2 = sc.nextInt(); // Carla's points

        int competitions = 0;

        while (p1 < p2 + 10) {
            p1 += 2; // Alex earns 2 points
            p2 += 1; // Carla earns 1 point
            competitions++;
        }

        System.out.println(competitions);
    }
}
