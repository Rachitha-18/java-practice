package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern08IncreasingStartPattern {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k=0;
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
