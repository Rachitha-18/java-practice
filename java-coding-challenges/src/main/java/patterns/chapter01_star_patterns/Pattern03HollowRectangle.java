package patterns.chapter01_star_patterns;

import java.util.Scanner;

public class Pattern03HollowRectangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        System.out.println("Enter no of column");
        int column = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        }
}
