package numeric_programs;

import java.util.Scanner;

public class FibonacciRangeFor {
    public static void main(String[] args) {
        System.out.println("Enter no of terms range");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int f0=0, f1=1, f2;
        for (int i = 2; f0+f1 <= num; i++) {
            f2=f0+f1;
            System.out.println(f2+" ");
            f0=f1;
            f1=f2;
        }
    }
}
