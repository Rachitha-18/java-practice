package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern03RotatingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                int k = i+j-1;
                if(k>4)
                    k=k-4;
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
