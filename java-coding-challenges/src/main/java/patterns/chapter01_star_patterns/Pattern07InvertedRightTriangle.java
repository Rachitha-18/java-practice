package patterns.chapter01_star_patterns;

import java.util.Scanner;

public class Pattern07InvertedRightTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= row; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
