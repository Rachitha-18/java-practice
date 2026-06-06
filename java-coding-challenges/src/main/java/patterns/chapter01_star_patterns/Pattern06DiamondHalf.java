package patterns.chapter01_star_patterns;

import java.util.Scanner;

public class Pattern06DiamondHalf {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        System.out.println("Enter no of columns");
        int column = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 4; k++) {
            for (int j = 4; j >= k; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
}
