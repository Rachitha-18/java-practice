package numeric_programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter no of terms");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int f0=0, f1=1, f2;
        for (int i = 1; i <= num; i++) {
            f2=f0+f1;
            System.out.println(f0+" ");
            f0=f1;
            f1=f2;
        }
    }
}
