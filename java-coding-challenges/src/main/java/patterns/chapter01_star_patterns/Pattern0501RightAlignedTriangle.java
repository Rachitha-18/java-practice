package patterns.chapter01_star_patterns;

import java.util.Scanner;

public class Pattern0501RightAlignedTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
