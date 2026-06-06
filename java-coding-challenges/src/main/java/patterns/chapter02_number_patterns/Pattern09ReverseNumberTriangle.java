package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern09ReverseNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k=0;
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
