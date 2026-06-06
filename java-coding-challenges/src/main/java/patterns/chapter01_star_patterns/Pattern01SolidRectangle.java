package patterns.chapter01_star_patterns;

import java.util.Scanner;

public class Pattern01SolidRectangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        System.out.println("Enter no of column");
        int column = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

