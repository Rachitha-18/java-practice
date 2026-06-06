package patterns.chapter01_star_patterns;

import java.util.Scanner;

public class Pattern04InvertedTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        System.out.println("Enter no of column");
        int column = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = column; j >= i; j--) {
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
