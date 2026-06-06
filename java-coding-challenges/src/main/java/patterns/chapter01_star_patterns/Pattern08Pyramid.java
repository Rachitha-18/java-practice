package patterns.chapter01_star_patterns;

import java.util.Scanner;

public class Pattern08Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int l=20;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= l - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
