package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern11FloydTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k=0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(" " + k++);
            }
            System.out.println();
        }
    }
}
