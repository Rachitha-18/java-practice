package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern02RepeatedNumbers {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
