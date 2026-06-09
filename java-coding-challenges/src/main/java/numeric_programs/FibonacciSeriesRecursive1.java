package numeric_programs;

import java.util.Scanner;

public class FibonacciSeriesRecursive1 {
    public static void main(String[] args) {
        System.out.println("Enter no of terms");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.printf(fibo(i) + " ");
        }
    }

    private static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibo(n - 2) + fibo(n - 1);
    }
}
