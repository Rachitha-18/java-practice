package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern05DescendingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int k = num ; k >= i; k--) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
